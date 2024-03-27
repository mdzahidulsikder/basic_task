import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.gov.uk/government/publications/businesses-not-complying-with-money-laundering-regulations-in-2018-to-2019/list-of-businesses-for-tax-year-2019-to-2020-that-have-not-complied-with-the-2017-money-laundering-regulations";

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                .header("authority", "www.gov.uk")
                .build();

        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String htmlContent = httpResponse.body();
            String regex = "<table>([\\s\\S]*?)<\\/table>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcherTable = pattern.matcher(htmlContent);

            while (matcherTable.find()) {
                String table = matcherTable.group(1);
                // Define XML structure
                StringBuilder xmlBuilder = new StringBuilder();
                xmlBuilder.append("<businessData>\n");

                // Define row regex for extracting data
                String rowRegex = "<td>(.+?)(?=<abbr|<)";
                Pattern rowPattern = Pattern.compile(rowRegex);
                Matcher dataMatcher = rowPattern.matcher(table);

                String[] properties = ["business", "address", "branch", "description", "penalty", "appealStatus"];
                int propertyIndex = 0;

                while (dataMatcher.find() && propertyIndex < properties.length) {
                    String data = dataMatcher.group(1);
                    // Append property to XML
                    xmlBuilder.append("\t<").append(properties[propertyIndex]).append(">").append(data).append("</").append(properties[propertyIndex]).append(">\n");
                    propertyIndex++;
                }

                xmlBuilder.append("</businessData>");
                System.out.println(xmlBuilder.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
