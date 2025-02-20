import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 


		int X = 0;
		int Y = 0;
		
        do{

            X = ler.nextInt();
            Y = ler.nextInt();

            if (X != Y){
                if (X > Y) {
                    System.out.println("Decrescente");
                }
                else{
                    System.out.println("Crescente");
                }
            }

        }while(X != Y);

	}
}