import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        double calculo = 0;

        if (N > 5 && N < 2000) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                     calculo = Math.pow(i , 2);
                    System.out.println(String.format(i + "^2 = %.0f", calculo));
                    
                }
            
            }
        }
    }
}
