import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 

        int valor;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorPar = 0;
        int contadorImpar = 0;


        for(int i = 0 ; i < 5 ; i++){
            valor = ler.nextInt();
            if (valor > 0) {
                contadorPositivo++;              
            }
            else if (valor < 0){
                contadorNegativo++;
            }
            if(valor % 2 == 0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
  
        }

        
        System.out.println(contadorPar + " valor(es) par(es)");
        System.out.println(contadorImpar + " valor(es) impar(es)");
        System.out.println(contadorPositivo + " valor(es) positivo(s)");
        System.out.println(contadorNegativo + " valor(es) negativo(s)");
    }
}
