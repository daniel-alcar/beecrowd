import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        int mult;

        if (N > 2 && N < 1000) {

            for (int i = 1; i <= 10; i++) {
                mult = i * N;
                System.out.println(i + " x " + N + " = " + mult); 
                
            }
            
        }
    }
}
