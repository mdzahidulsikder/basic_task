import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.regex.Matcher
import java.util.regex.Pattern
import groovy.xml.*
import groovy.xml.MarkupBuilder
import java.nio.file.*

String url = "https://www.gov.uk/government/publications/businesses-not-complying-with-money-laundering-regulations-in-2018-to-2019/list-of-businesses-for-tax-year-2019-to-2020-that-have-not-complied-with-the-2017-money-laundering-regulations";

try {
    HttpClient httpClient = HttpClient.newHttpClient();
    HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();

    HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    def responseBody = httpResponse.body();


    //getting the table one
    ArrayList<String> tableString = new ArrayList<>();
    def businessesList = []
    String logic1 = '<table>([\\s\\S]*?)<\\/table>'
    Pattern logic1Pattern = Pattern.compile(logic1);
    Matcher matcher = logic1Pattern.matcher(responseBody)


    //All tables get listed to TableString ArrayList
    while (matcher.find()) {
        tableString.add(matcher.group(1));

    }

    //work on table 1
    String table1 = tableString.get(0);
    //Fetch 2022 data from the table
    String regex2022 = '<td>(.*?)\\s*<abbr title="[A-Za-z ]*">(.*?)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>'
    logic1Pattern = Pattern.compile(regex2022);
    matcher = logic1Pattern.matcher(table1);


    while (matcher.find()) {
//        println "InformationL:  "
//        print matcher.group(1) + " "+ matcher.group(2)+" "+ matcher.group(3)+" "+matcher.group(4)+" "+matcher.group(5)+" "+matcher.group(6) +" "+matcher.group(7)
        def businessData = [
                businessName     : matcher.group(1) + " " + matcher.group(2),
                registeredAddress: matcher.group(3) + " UK",
                penaltyAmount    : matcher.group(6),
                description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + matcher.group(5)
        ]
        businessesList << businessData
        println()
    }


    //working on tabel 2
    String table2 = tableString.get(1);
    //Fetch 2021 data from the table
    String regex2021 = '<td>(.*?)\\s*<abbr title="[A-Za-z ]*">(.*?)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>'
    logic1Pattern = Pattern.compile(regex2021);
    matcher = logic1Pattern.matcher(table2);


    while (matcher.find()) {
//        println "InformationL:  "
//        print matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3) + " " + matcher.group(4) + " " + matcher.group(5) + " " + matcher.group(6) + " " + matcher.group(7)
        def businessData = [
                businessName     : matcher.group(1) + " " + matcher.group(2),
                registeredAddress: matcher.group(3) + " UK",
                penaltyAmount    : matcher.group(6),
                description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + matcher.group(5)
        ]
        businessesList << businessData

    }


    //work on table 3
    String table3 = tableString.get(2);
    //Fetch 2022 data from the table
    String regex2022_1 = '<td>(.*?)\\s*<abbr title="[A-Za-z ]*">(.*?)<\\/abbr>\\s*<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>\\s*<td>(.*)<\\/td>'
    logic1Pattern = Pattern.compile(regex2022_1);
    matcher = logic1Pattern.matcher(table3);


    while (matcher.find()) {
//        println "InformationL:  "
//        print matcher.group(1) + " "+ matcher.group(2)+" "+ matcher.group(3)+" "+matcher.group(4)+" "+matcher.group(5)+" "+matcher.group(6) +" "+matcher.group(7)
        def businessData = [
                businessName     : matcher.group(1) + " " + matcher.group(2),
                registeredAddress: matcher.group(3) + " UK",
                penaltyAmount    : matcher.group(6),
                description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + matcher.group(5)
        ]
        businessesList << businessData
        println()
    }
    //work on table 4
    String table4 = tableString.get(3);

//    println("hello"+ table4)
    //Fetch 2022 data from the table
    String regex2022_2 = '<td>(.*?)\\s*<abbr[^>]*>(.*?)<\\/abbr>\\s*\\)<\\/td>\\s*<td>(.*?)<\\/td>\\s*<td>(.*?)<\\/td>\\s*<td>(.*?)<\\/td>\\s*<td>(.*?)<\\/td>\n'
    logic1Pattern = Pattern.compile(regex2022_2);
    matcher = logic1Pattern.matcher(table4);


    while (matcher.find()) {
//        println "InformationL:  "
//        print matcher.group(1) + " "+ matcher.group(2)+" "+ matcher.group(3)+" "+matcher.group(4)+" "+matcher.group(5)+" "+matcher.group(6) +" "+matcher.group(7)
        def businessData = [
                businessName     : matcher.group(1) + " " + matcher.group(2),
                registeredAddress: matcher.group(3) + " UK",
                penaltyAmount    : matcher.group(6),
                description      : "This entity appears on the UK Government Corporate Report published list of businesses that have not complied with the regulations. " + matcher.group(5)
        ]
        businessesList << businessData
    }


    // Build the XML structure using MarkupBuilder
    def writer = new StringWriter()
    def xmlBuilder = new MarkupBuilder(writer)
    xmlBuilder.businesses() {
        businessesList.each { businessData ->
            business() {
                "Name" businessData.businessName
                "Address" businessData.registeredAddress
                "Url" url
                "Remark" "Penalty Amount: " + businessData.penaltyAmount
                "Description" businessData.description
                "Date" "NO Date"
            }
        }
    }


    // Write  XML to a file
    def xmlString = writer.toString()
    Path outputFilePath = Paths.get("output.xml")
    Files.write(outputFilePath, xmlString.getBytes())


} catch (Exception e) {
    println e
}

