import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class Main {
    public static void main(String[] args) {
        String url = "https://api.nasa.gov/planetary/apod?api_key=rcWswoo2rOLnTtbx3H9bZHfnTVv4GpbNvwp20PbH";

       CloseableHttpClient httpClient = HttpClients.createDefault();
    }
}
