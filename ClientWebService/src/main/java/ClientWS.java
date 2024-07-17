import com.sun.tools.rngom.digested.Main;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getId());
        System.out.println(cp.getSolde());



    }
}
