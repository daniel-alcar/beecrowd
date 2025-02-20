import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        
        int N = 100, X, maior = 0,posi = 0;
 

		for (int i = 1; i <= N; i++) {
			X = ler.nextInt();
			
        if (maior > X) {
            maior = maior;
            posi = posi;
        }else {
            maior = X;
            posi = i;
        }  
        
        
    }
    System.out.print(maior + "\n" + posi + "\n");

}


}