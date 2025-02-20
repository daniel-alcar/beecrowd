import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 

        int valor = ler.nextInt();
            if(valor > 50){
                return;
            }
            else {
                System.out.println("N[0] = " + valor);    
            for (int i = 1; i < 10; i++) {
                valor = valor * 2;
                System.out.println("N[" + i + "] = " + valor);
            }
        }
	}
}