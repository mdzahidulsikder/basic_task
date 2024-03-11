import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        /**
         * URL = Uniform Resource Locator
         * url = protocol + hostname+ pathname
         * protocol = http
         * hostname = www.youtube.com
         * get some information form a website
         *
         * HTTP_ACCEPTED = 202
         * HTTP_OK =200
         * HTTP_CREATED = 201
         * HTTP_BAD_REQUEST = 400 = invalid request message
         * 401 = Unauthorized / unauthenticated
         * HTTP_FORBIDDEN = 403 = unauthorized / expired token access
         * HTTP_BAD_METHOD = 405
         * HTTP_CONFLICT =409
         * HTTP_CLIENT_TIMEOUT = 408
         * HTTP_GONE = 410
         * HTTP_LENGTH_REQUIRED = 411
         * HTTP_BAD_GATEWAY = 502
         *
         * Information response = 100-199
         * Success responses = 200-209
         * Redirect message = 300- 309
         * client error response = 400 - 499
         * server error response = 500 -599
         *
         *  https://github.com/mdn/content/blob/main/files/en-us/web/http/status/index.md
         *
         * String = immutable = take more memory to replace value; not thread safe/ non-synchronized ; slow ; when data will not change
         * StringBuffer = mutable = less memory; synchronized + thread safe; more fast than string ; when data will change frequently
         * StringBuilder = mutable = less memory; not thread safe/ non-synchronized; fast than string or StringBuilder ; when data will change frequently
         * BufferReader = use to read data
         */

        try {
            String urlInternet = "https://www.youtube.com/watch?v=Ps2q_purSrM";
            URL url = new URL(urlInternet);
            System.out.println("Host: "+url.getHost());
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("File name : "+ url.getFile());


            /**
             * url connection preparing
             * InputStream = to read  data
             *
             */

            URLConnection urlConnection = url.openConnection();
            InputStream stream =urlConnection.getInputStream();
            int i = 0;
            while ((i = stream.read())!= -1){
               // System.out.print((char) i);
            }


            /**
             * HttpUrlConnection =
             *
             */

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            System.out.println("----------HttpUrlConnection---------");
            for (int j = 0; j<=10; j++){
                System.out.println(httpURLConnection.getHeaderFieldKey(j) + " = " + httpURLConnection.getHeaderField(j));
            }

            httpURLConnection.disconnect();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
