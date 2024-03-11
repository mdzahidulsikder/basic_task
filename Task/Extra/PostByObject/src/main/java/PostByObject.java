import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class PostByObject {
    public static void main(String[] args) {
        try {
            HashMap<String, Object> carAttributes = new HashMap<>();
            carAttributes.put("year", 2019);
            carAttributes.put("price", 4999.99);
            carAttributes.put("colour", "blue");
            Car car1 = new Car("BWM x5", carAttributes);

            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = objectMapper.writeValueAsString(car1);

            String webUrl = "https://api.restful-api.dev/objects";
            URL url = new URL(webUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "Application/json");
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");

            try (DataOutputStream dos = new DataOutputStream(urlConnection.getOutputStream())) {
                dos.writeBytes(requestBody);
            }
            try (BufferedReader bf = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
                bf.close();
            }
            urlConnection.disconnect();
        } catch (IOException i) {
            throw new RuntimeException(i);
        }
    }
}
