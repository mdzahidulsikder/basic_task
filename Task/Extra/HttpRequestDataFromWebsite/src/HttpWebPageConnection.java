import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpWebPageConnection {
    public static void main(String[] args) {
        String webUrl = "https://jsonplaceholder.typicode.com/";
        try {
            URL url = new URL(webUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            int response = urlConnection.getResponseCode();
            if (response == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String makeLine;
                StringBuilder htmlText = new StringBuilder();
                while ((makeLine = reader.readLine())!=null){
                    htmlText.append(makeLine+ "\n");
                }
                reader.close();
                System.out.println(htmlText);
            }else {
                System.out.println("Invalid Request. Status = " + response);
            }
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
