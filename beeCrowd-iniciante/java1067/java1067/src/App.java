import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int cal = 0;

        if (x >=1 && x <= 1000) {
            for(int i = 0 ; i <= x ; i++){
                if (i % 2 != 0) {
                    cal += i;

                }
            }
            System.out.println(cal);
        }
    }
}
