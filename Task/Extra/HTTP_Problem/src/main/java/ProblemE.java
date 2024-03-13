import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import java.nio.charset.StandardCharsets;

public class ProblemE {
    public static void main(String[] args) {
        String urlLink = "https://www.dfat.gov.au/international-relations/security/sanctions/consolidated-list";
        try {
            URL url = new URL(urlLink);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            urlConnection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (GZIPInputStream gzipInputStream = new GZIPInputStream(urlConnection.getInputStream());
                     BufferedReader reader = new BufferedReader(new InputStreamReader(gzipInputStream, StandardCharsets.UTF_8))) {
                    StringBuffer htmlText = new StringBuffer();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        htmlText.append(line).append("\n");
                    }
                    System.out.println(htmlText);
                }

            } else {
                System.out.println("Something is wrong, and your status code is " + responseCode);
            }
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
