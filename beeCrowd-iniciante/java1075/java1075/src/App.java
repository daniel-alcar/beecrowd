import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        
        
        int N = ler.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
                
            }
            
        }
    }
}
