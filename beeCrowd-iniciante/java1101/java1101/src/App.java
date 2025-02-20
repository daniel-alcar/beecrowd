import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 


		int m = ler.nextInt();
		int n = ler.nextInt();
		
		while (m > 0 && n > 0) {

			int menor = m;
			int maior = n;
			
			if (m > n) {
				menor = n;
				maior = m;
			}
			
			int soma = 0;
			for (int i=menor; i<=maior; i++) {
				soma = soma + i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + soma);
			
			m = ler.nextInt();
			n = ler.nextInt();
		}
		

	}
}