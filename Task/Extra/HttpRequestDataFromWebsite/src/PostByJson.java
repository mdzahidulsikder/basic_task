import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostByJson {
    public static void main(String[] args) {
        try {
           // String body = "{\"name\":\"AppleiPadletest\",\"data\":{\"Generation\":\"4th\",\"Price\":\"2000\",\"Capacity\":\"256GB\"}}";

            String body = "{" +
                    "\"name\":\"AppleiPadletest\"," +
                    "\"data\":" +
                    "{\"Generation\":\"4th\"," +
                    "\"Price\":\"2000\"," +
                    "\"Capacity\":\"256GB\"}" +
                    "}";

            String webUrl = "https://api.restful-api.dev/objects";
            URL url = new URL(webUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "Application/json");
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");

            try (DataOutputStream dos = new DataOutputStream(urlConnection.getOutputStream())){
                dos.writeBytes(body);
            }
            try (BufferedReader bf = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                while ((line = bf.readLine())!= null){
                    System.out.println(line);
                }

            }
        } catch (IOException i) {
            throw new RuntimeException(i);
        }


    }
}
