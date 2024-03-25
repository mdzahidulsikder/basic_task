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
                .flatMap(entry -> {
                    String headerName = entry.getKey()
                    String headerValue = entry.getValue()
                    return Stream.of(headerName, headerValue)
                }

                )
                .toArray(String[]::new)
        )
        .build()
try {
    HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())

    int responseCode = httpResponse.statusCode()
    //  println (responseCode)
    httpResponse.body()


    // full table regex = <table>[\\s\\S]*?<\\/table>
    def regexTable = "<table>([\\s\\S]*?)<\\/table>"
    def htmlContent = httpResponse.body()
    def matcherTable = htmlContent =~ regexTable




    //table find
    while (matcherTable.find()) {
        def table = matcherTable.group(1)
       // println("Main Entity Name: " +table)
        //table row find

        def rowRegex = "<tr>([\\s\\S]*?)<\\/tr>"
        def rowMatcher = table =~ rowRegex

        while (rowMatcher.find()){
            def tableRow= rowMatcher.group(1)
           // println (tableRow)
            //business name find
            // business name regex = <td>(.*)?<abbr
            def businessNameRegex = "<td>(.*)?<abbr"

            def businessNameMatcher = table =~ businessNameRegex
            while (businessNameMatcher.find()) {
                def businessName = businessNameMatcher.group(1)
                // println(businessName)
            }

            def dataCollectRegex = "<td>(.*)?<\\/td>"
            def dataMatch = table =~ dataCollectRegex
            while (dataMatch.find()){
                def data = dataMatch.group(1)
                println(data)
            }
        }
    }

} catch (Exception e) {
    e.printStackTrace()
}






