import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in); 

        int x[] = new int[10];
        
        for (int i = 0; i <= 9; i++) {
            x[i] = ler.nextInt();
        }
        for (int i = 0; i <= 9; i++) {
            if (x[i] <= 0) {
                System.out.println("X[" + i + "] = " + 1);
            }
            else{
                System.out.println("X[" + i + "] = " + x[i]);
            }
        }
	}
}