import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();

        if(N < 10000){
            for (int i = 0; i < N; i++) {
                int num = ler.nextInt();

                if(num == 0){
                    System.out.printf("NULL\n");
                }
    
                else if(num % 2 == 0 && num > 0){
                    System.out.printf("EVEN POSITIVE\n");

                }
                else if (num % 2 == 0 && num < 0) {
                    System.out.printf("EVEN NEGATIVE\n");
                }
                else if (num % 2 != 0 && num > 0) {
                    System.out.printf("ODD POSITIVE\n");
                }
                else if (num % 2 != 0 && num < 0) {
                    System.out.printf("ODD NEGATIVE\n");
                }
            
            
            }


        }


    }
}
