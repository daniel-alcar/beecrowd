import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int n, k, subt, fat1 = 1, fat2 = 1;
        float calc;
        
        
        n = ler.nextInt();
        k = ler.nextInt();
        subt = n - k;

        for (int i = 1; i <= n; i++) {
            fat1 = fat1 * i;
        }
        for (int i = 1; i <= subt; i++) {
            fat2 = fat2 * i;
        }
        calc = fat1 / fat2;
        System.out.println(calc);
 
    }
}
