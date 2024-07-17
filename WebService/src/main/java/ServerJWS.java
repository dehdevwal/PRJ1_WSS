import jakarta.xml.ws_prj.Endpoint;
import ws_prj.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {
        String url = "http://localhost:9191/";

        Endpoint.publish(url,new BanqueService());

        System.out.println("Web Service deploy on "+ url);

    }
}
