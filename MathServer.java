import java.lang.SecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathServer {

    public static void main(String args[]){
        System.setSecurityManager(new SecurityManager());
        try{
            IRemoteMath remoteMath = new RemoteMathServant();
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Compute", remoteMath );
            System.out.println("Math server ready");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}