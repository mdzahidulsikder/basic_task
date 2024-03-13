import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ProblemA {
    public static void main(String[] args) {

        try {
            String urlLink = "https://www.finra.org/arbitration-mediation/arbitration-awards";
            URL url = new URL(urlLink);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuffer htmlText = new StringBuffer();
                String line;
                while ((line = reader.readLine())!=null){
                    htmlText.append(line +"\n");
                }
                System.out.println(htmlText);
            }else {
                System.out.println("Something wrong and your response code = " + responseCode);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
