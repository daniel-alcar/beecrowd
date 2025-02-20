import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();

        if ( A < B){
            if(B%A == 0){
                System.out.println("Sao Multiplos");
            }
            else{
                System.out.println("Nao sao Multiplos");        
            }
        }
        else{
            if(A%B == 0){
                System.out.println("Sao Multiplos");
            }
            else{
                System.out.println("Nao sao Multiplos");        
            }  
        }
    }
}
