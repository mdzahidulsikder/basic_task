import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTP_Problem_03 {
    public static void main(String[] args) {
        try {
            String webUrl = "https://www.accessdata.fda.gov/scripts/ImportRefusals/index.cfm";
            URL url = new URL(webUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setRequestMethod("GET");
            int responseStatus =urlConnection.getResponseCode();
            System.out.println("Hello");
            if (responseStatus == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line;
                StringBuffer htmlText = new StringBuffer();
                while ((line = reader.readLine()) != null){
                    htmlText.append(line+"\n");
                }
                reader.close();
                System.out.println(htmlText);
            }else {
                System.out.println("Invalid request. Please try again.");
            }
            urlConnection.disconnect();
        } catch (MalformedURLException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
