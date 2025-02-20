import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 

        double A[] = new double[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = ler.nextDouble(); 
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
	}
}