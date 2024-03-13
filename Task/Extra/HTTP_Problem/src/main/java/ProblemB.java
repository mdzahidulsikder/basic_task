import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ProblemB {
    public static void main(String[] args) throws IOException {

        String urlLink = "https://www.nseindia.com/invest/investors-regulatory-actions";
        URL url = new URL(urlLink);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        try {
            urlConnection.setRequestMethod("GET");
            int responseCode = urlConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder htmlText = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    htmlText.append(line).append("\n");
                }
                System.out.println(htmlText);
            } else {
                System.out.println("Something wrong and your response code = " + responseCode);
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
