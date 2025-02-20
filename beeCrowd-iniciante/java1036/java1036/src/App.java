import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner ler = new Scanner(System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

        if((A == 0) || (((Math.pow(B,2)) - (4 * A * C)) < 0)){
            System.out.print("Impossivel calcular");
        }
        else{
            double R1 = ((- B + Math.sqrt(((Math.pow(B , 2)) - (4 * A * C)))) / (2 * A)); 
            double R2 = ((-B - Math.sqrt(((Math.pow(B,2)) - (4 * A * C)))) / (2 * A));

            
            System.out.printf("R1 = %.5f", R1);
            System.out.printf("R2 = %.5f", R2);
        }
        
        ler.close();
    }
}
