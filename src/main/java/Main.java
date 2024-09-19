import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://api.nasa.gov/planetary/apod?api_key=rcWswoo2rOLnTtbx3H9bZHfnTVv4GpbNvwp20PbH";

       CloseableHttpClient httpClient = HttpClients.createDefault();

       HttpGet request = new HttpGet(url);
       CloseableHttpResponse response = httpClient.execute(request);

    }
}
