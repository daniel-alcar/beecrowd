import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner ler =new Scanner(System.in);
        
        
        int N = ler.nextInt();
        int vetor[] = new int[N];
        int menor = 0;
        int posicao = 0;
        
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
            if(vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
        
        
	}

}
