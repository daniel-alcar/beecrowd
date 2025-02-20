import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        
        int x = ler.nextInt();
        int i =0;
        while ( i < 6) {
            if (x % 2 == 1) {
                System.out.println(x); 
                i++;
            }
            x++;
        }

    }
}
