import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int positivo = 0;

        for(int i = 0; i < 6; i++){
            double num = ler.nextDouble();
            if(num > 0){
                positivo++;
                
            }
        }
        System.out.printf("%d valores positivos", positivo);

       
    }
}