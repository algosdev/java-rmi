
import java.lang.SecurityManager;
import java.rmi.Naming;
import java.rmi.registry.*;


public class MathClient {


    public static void main(final String[] args) {
        try {

            if (System.getSecurityManager() == null)

                System.setSecurityManager(new SecurityManager());
            LocateRegistry.getRegistry("localhost");
            IRemoteMath remoteMath =(IRemoteMath) Naming.lookup("Compute");

            System.out.println("1.7 + 2.8 = " + remoteMath.add(1.7, 2.8));
            System.out.println("6.7 - 2.3 = " + remoteMath.subtract(6.7, 2.3));
            System.out.println("6.7 / 2.3 = " + remoteMath.divide(6.7, 2.3));
            System.out.println("84.0 * 5.0 = " + remoteMath.multiply(84.0, 5.0));
        }
        catch (final Exception e) {

            System.out.println( e );

        }

    }

}
