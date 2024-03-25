import groovy.xml.MarkupBuilder

import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
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
                                    .flatMap(entry ->{
                                        String headerName = entry.getKey()
                                        String headerValue = entry.getValue()
                                        return Stream.of(headerName,headerValue)
                                    }

                                    )
                                    .toArray(String[]::new)
                            )
                            .build()
try{
    HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())
    def htmlContent = httpResponse.body()
    def regex = "<table>([\\s\\S]*?)<\\/table>"
    def pattern = Pattern.compile(regex)
    def matcherTable = pattern.matcher(htmlContent)

    while (matcherTable.find()) {
        def table = matcherTable.group(1)
        // println("Main Entity Name: " +table)
        //table row find

        def rowRegex = "<td>(.+?)(?=<abbr|<)"
        def dataMatch = table =~ rowRegex



        def writer = new StringWriter()
        def xmlBuilder = new groovy.xml.MarkupBuilder(writer)


        while (dataMatch.find()){
            def data= dataMatch.group(1)
            println(data)
        }






    }

}catch (Exception e) {
    e.printStackTrace()
}
