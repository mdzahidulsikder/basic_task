import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Http_Problem_02 {
    public static void main(String[] args) {
        try {
            String url = "https://www.dfat.gov.au/international-relations/security/sanctions/consolidated-list";

            Map<String, String> headers = new HashMap<>();

            headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            headers.put("Authorization", "www.nseindia.com");
            headers.put("Content-Type", "text/html");

            try {

                StringBuilder commandBuilder = new StringBuilder("curl");

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    commandBuilder.append(" -H \"").append(entry.getKey()).append(": ").append(entry.getValue()).append("\"");
                }
                commandBuilder.append(" ").append(url);
                Process process = Runtime.getRuntime().exec(commandBuilder.toString());

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                StringBuilder output = new StringBuilder();

                String line;

                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }

                int exitCode = process.waitFor();

                System.out.println("Output:\n" + output.toString());
                System.out.println("Exit Code: " + exitCode);


            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}