import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n[] = new int[20];
        int y;
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        
        int valorFinal = n.length - 1;
        for (int i = 0; i < n.length / 2; i++) {
            y = n[i];
            n[i] = n[valorFinal];
            n[valorFinal] = y;
            valorFinal--;
        }
               
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
        }
    }
}