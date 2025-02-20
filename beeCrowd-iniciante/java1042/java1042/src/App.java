import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();


        if(A < B && A < C){
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            }
            else{
                System.out.println(C);
                System.out.println(B);
            }
        }
        else if(C < B){
            System.out.println(C);
            if (A < B) {
                System.out.println(A);
                System.out.println(B);
            }
            else{
                System.out.println(B);
                System.out.println(A);
            }
        }
        else{
            System.out.println(B);
            if(A < C){
                System.out.println(A);
                System.out.println(C);                
            }
            else{
                System.out.println(C);
                System.out.println(A);  
            }

        }
        System.out.println("");
        System.out.println(A);
        System.out.println(B);   
        System.out.println(C);   
    }
}
