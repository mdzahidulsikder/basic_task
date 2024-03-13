package LearnUrl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LearnUrl {

    public static void main(String[] args) throws IOException {
        String urlLink = "https://www.epa.vic.gov.au/about-epa/public-registers/court-proceedings/";
        URL url  = new URL(urlLink);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        int responseStatus = urlConnection.getResponseCode();
        System.out.println(responseStatus);
        if (responseStatus == HttpURLConnection.HTTP_OK){
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine())!=null){
                buffer.append(line);
                System.out.println(line);
            }
        }else {
            System.out.println("Something wrong.");
        }

    }
}
