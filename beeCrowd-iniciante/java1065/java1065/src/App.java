import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 

        int valor;
        int contador = 0;

        for(int i = 0 ; i < 5 ; i++){
            valor = ler.nextInt();
            if(valor % 2 == 0){
                contador++;
                
            }
        }
        System.out.println(contador + " valores pares");


    }
}
