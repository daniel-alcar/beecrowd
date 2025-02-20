import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();

        int soma1 = C + D;
        int soma2 = A + B;
        if(B > C && D > A && soma1 > soma2 && C >= 1 && D >=1 && A % 2 == 0){

            System.out.println("Valores aceitos");

        }
        else{
            System.out.println("Valores nao aceitos");
        }

        ler.close();

    }
}
