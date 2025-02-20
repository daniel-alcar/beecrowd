import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int contador = 0;
        double valor, media = 0;
 
        for (int i = 0; i < 6; i++) {
            valor = ler.nextDouble();
            if(valor > 0){
                contador++;
                media += valor;
            }
            
        }
        media = media / contador;

        System.out.println(contador + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
