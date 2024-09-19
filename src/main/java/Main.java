import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://api.nasa.gov/planetary/apod?api_key=rcWswoo2rOLnTtbx3H9bZHfnTVv4GpbNvwp20PbH";

       CloseableHttpClient httpclient = HttpClients.createDefault();
       ObjectMapper mapper = new ObjectMapper();

       HttpGet request = new HttpGet(url + "&date=2024-09-11");
       CloseableHttpResponse response = httpclient.execute(request);

//       Scanner sc = new Scanner(response.getEntity().getContent());
//       System.out.println(sc.nextLine());
        NasaAnswer answer = mapper.readValue(response.getEntity().getContent(), NasaAnswer.class);

      String imageUrl = answer.url;
      String[] urlSplitted = imageUrl.split("/");
      String fileName = urlSplitted[urlSplitted.length - 1];

      HttpGet imageRequest = new HttpGet(imageUrl);
      CloseableHttpResponse image = httpclient.execute(imageRequest);

        FileOutputStream fos = new FileOutputStream("Image/" + fileName);
        image.getEntity().writeTo(fos);
    }
}


