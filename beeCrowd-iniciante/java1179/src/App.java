import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int par[] = new int[5];
        int impar[] = new int[5];
        int valor, contP = 0, contI = 0;

        for (int i = 0; i < 15; i++) {
            valor = ler.nextInt();

            if(valor % 2 == 0){
                par[contP] = valor;
                contP++;
            }
            else{
                impar[contI] = valor;
                contI++;
            }
            if (contP == 5) {
        		contP = 0;
        		for (int j = 0; j < par.length; j++) {
        			System.out.println("par[" + j + "] = " + par[j]);
        		}
        	} else if (contI == 5) {
        		contI = 0;
        		for (int j = 0; j < impar.length; j++) {
        			System.out.println("impar[" + j + "] = " + impar[j]);
        		}
        	}
        }
        
        for (int i = 0; i < contI; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < contP; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
        }
    }
	
}