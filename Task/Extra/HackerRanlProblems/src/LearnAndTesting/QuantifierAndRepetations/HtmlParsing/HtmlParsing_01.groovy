import groovy.xml.MarkupBuilder

import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.stream.Stream

def url = "https://www.gov.uk/government/publications/businesses-not-complying-with-money-laundering-regulations-in-2018-to-2019/list-of-businesses-for-tax-year-2019-to-2020-that-have-not-complied-with-the-2017-money-laundering-regulations"
def headers = [:]
headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
headers.put("authority", "www.gov.uk")

HttpClient httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .build()

HttpRequest httpRequest = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .headers(headers.entrySet().stream()
                .flatMap(entry -> {
                    String headerName = entry.getKey()
                    String headerValue = entry.getValue()
                    return Stream.of(headerName, headerValue)
                })
                .toArray(String[]::new)
        )
        .build()
try {
    HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())

    def htmlSourceCode = httpResponse.body()


    String searchTableRegex = "<table>([\\s\\S]*?)<\\/table>"

    def tableList = []


    def businessList = []

    Pattern tableMatchPattern = Pattern.compile(searchTableRegex)
    Matcher matcher = tableMatchPattern.matcher(htmlSourceCode)


    while (matcher.find()) {
        tableList.add(matcher.group(1))
    }
    def trRegex = "<tr>([\\s\\S]*?)<\\/tr>"
    def trMatcher = tableList =~ trRegex
    while (trMatcher.find()) {
        def trData = trMatcher.group(1)

        def tdRegex = "<td>(.*?\\s*)<abbr\\s*title=\\\"[a-zA-z].*\\\">(.*)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"

        def tdMatcher = trData =~ tdRegex
        while (tdMatcher.find()) {
            def businessData = [

                    businessName     : (tdMatcher.group(1) + " " + tdMatcher.group(2)).replaceAll("(?s)\\s+", " ").replaceAll(/&amp;/, " & "),
                    registeredAddress: tdMatcher.group(3) + "UK",
                    penaltyAmount    : tdMatcher.group(6),
                    description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + tdMatcher.group(5)
            ]
            businessList << businessData
        }

        def table04Regex = "<td>(.*?\\s*)<abbr\\s*title=\"[A-Za-z].*\">(.*)<\\/abbr>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"
        def table04Matcher = trData =~ table04Regex

        while (table04Matcher.find()) {
            def businessData = [
                    businessName     : (table04Matcher.group(1) + " " + table04Matcher.group(2) + table04Matcher.group(3)).replaceAll("(?s)\\s+"," ").replaceAll("((?s)&amp;)","\\&"),
                    registeredAddress: table04Matcher.group(4) + "UK",
                    penaltyAmount    : table04Matcher.group(7),
                    description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + table04Matcher.group(6)

            ]
            businessList << businessData
        }
    }

    def writer = new StringWriter()
    def xmlBuilder = new MarkupBuilder(writer)

    xmlBuilder.businesses() {
        businessList.each { businessData ->
            business() {
                "Name" businessData.businessName
                "Address" businessData.registeredAddress
                "Url" url
                "Description" businessData.description
                "Remark" "Penalty Amount: " + businessData.penaltyAmount
                "Date" "NO EVENT DATE"
            }
        }
    }
    def xmlString = writer.toString()
    Path outputFilePath = Paths.get("abc.xml")
    Files.write(outputFilePath, xmlString.getBytes())

} catch (Exception e) {
    e.stackTrace
}
