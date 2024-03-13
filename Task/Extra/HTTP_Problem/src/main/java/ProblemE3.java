import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ProblemE3 {
    public static void main(String[] args) {

        String url = "https://www.nseindia.com/invest/investors-regulatory-actions";

        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        headers.put("Accept-Encoding", "gzip, deflate, br");

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .headers(headers.entrySet().stream()
                        .flatMap(entry -> {
                            String headerName = entry.getKey();
                            String headerValue = entry.getValue();
                            return Stream.of(headerName, headerValue);
                        })
                        .toArray(String[]::new))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());
            if (response.headers().firstValue("Content-Encoding").orElse("").equalsIgnoreCase("gzip")){

            }else {
                System.out.println("Hello 2");
            }





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
