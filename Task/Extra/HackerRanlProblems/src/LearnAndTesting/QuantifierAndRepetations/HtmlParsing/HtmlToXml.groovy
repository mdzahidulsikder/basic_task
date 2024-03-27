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
    // output of html page.
    def htmlSourceCode = httpResponse.body()
    // println(htmlSourceCode)

    String searchTableRegex = "<table>([\\s\\S]*?)<\\/table>"
    // all table with html tag
    def tableList = []

    //table data here
    def businessList = []

    Pattern tableMatchPattern = Pattern.compile(searchTableRegex)
    Matcher matcher = tableMatchPattern.matcher(htmlSourceCode)

    while (matcher.find()) {
        tableList.add(matcher.group(1))
    }
    // total table found
    // println (tableList.size())
    String table1 = tableList.get(0)
    // println(table1)
    def regexTbl1 = "<td>(.*?\\s*)<abbr\\s*title=\"[a-zA-z].*\">(.*)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"
    def table01Matcher = table1 =~ regexTbl1
    //println(table01Matcher.size())
//    while (table01Matcher.find()) {
//        //println(table01Matcher.group(1) + " " + table01Matcher.group(2) + table01Matcher.group(3)+ " "+table01Matcher.group(4)+ " "+ table01Matcher.group(5)+" "+ table01Matcher.group(7))
//        //println(tableDataMatcher.group(6))
//        def businessData = [
//                businessName : table01Matcher.group(1)+ " " +table01Matcher.group(2),
//                registeredAddress : table01Matcher.group(3) + "UK",
//                penaltyAmount : table01Matcher.group(6),
//                description : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. "+ table01Matcher.group(5)
//        ]
//        businessList << businessData
//        //println (businessList)
//    }


    String table02 = tableList.get(1)
    //println(table02)
//    def regexTbl02 = "<td>(.*?\\s*)<abbr\\s*title=\"[a-zA-z].*\">(.*)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"
//
//    def table02Matcher = table02 =~ regexTbl02
//    while (table02Matcher.find()) {
//       // println(table02Matcher.group(02))
//
//        def businessData = [
//                businessName : table02Matcher.group(1)+ " " +table02Matcher.group(2),
//                registeredAddress : table02Matcher.group(3) + "UK",
//                penaltyAmount : table02Matcher.group(6),
//                description : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. "+ table02Matcher.group(5)
//        ]
//        businessList << businessData
//    }

    for (int i = 0; i < 4; i++) {
        String table03 = tableList.get(i)
        //  println(table03)
        def regexTbl03 = "<td>(.*?\\s*)<abbr\\s*title=\"[a-zA-z].*\">(.*)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"

        def table03Matcher = table03 =~ regexTbl03
        while (table03Matcher.find()) {
            // println(table02Matcher.group(03))
            def businessData = [
                    businessName     : table03Matcher.group(1) + " " + table03Matcher.group(2),
                    registeredAddress: table03Matcher.group(3) + "UK",
                    penaltyAmount    : table03Matcher.group(6),
                    description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + table03Matcher.group(5)
            ]
            businessList << businessData
        }
    }

    String last  = tableList.get(3)
    // println(last)
    def table04Regex = "<td>(.*?\\s*)<abbr\\s*title=\"[A-Za-z].*\">(.*)<\\/abbr>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>"
    def table04Matcher = tableList =~ table04Regex
    while (table04Matcher.find()){
        println(table04Matcher.group(1))
        def businessData = [
                businessName : table04Matcher.group(1)+" "+table04Matcher.group(2)+table04Matcher.group(3),
                registeredAddress : table04Matcher.group(4)+ "UK",
                penaltyAmount : table04Matcher.group(5),
                description : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " +table04Matcher.group(6)

        ]
        businessList << businessData
    }

// building xml file
    def writer = new StringWriter()
    def xmlBuilder = new MarkupBuilder()

    xmlBuilder.businesses() {
        businessList.each { businessData ->
            business() {
                "Main Entity Name" businessData.businessName
                "Address" businessData.registeredAddress
                "Entity URL" url
                "Event Description" businessData.description
                "Event Date" "NO EVENT DATE"
            }
        }
    }


    // ------------file write---------

    def xmlString = writer.toString()
    def outputFilePath = Paths.get("output.xml")
    Files.write(outputFilePath, xmlString.toString().getBytes())
    businessList.each { businessData ->

//
//        println("Main Entity Name: ${businessData.businessName}")
//        println("Address: ${businessData.registeredAddress}")
//        println("Entity URL: $url")
//        println("Remark: Penalty Amount: ${businessData.penaltyAmount}")
//        println("Event Description: ${businessData.description}")
//        println("Event Date: NO EVENT DATE")
//        println("----------------------------------------------------")
    }

} catch (Exception e) {
    e.stackTrace
}