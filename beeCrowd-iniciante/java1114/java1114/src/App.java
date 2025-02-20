import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 


		int senha = 2002;
		int teste = 0;
		
        do{

            teste = ler.nextInt();

            if (teste != senha) {
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");

            }
        }
        while( senha != teste);
	}
}