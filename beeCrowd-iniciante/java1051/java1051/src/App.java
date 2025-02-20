import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double salario = ler.nextDouble();

        if(salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        }
        else if(salario > 2000.00 && salario <= 3000.00){
            System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
        }
        else if(salario > 3000.00 && salario <= 4500.00){
            System.out.println(String.format("R$ %.2f", ((salario - 3000) * 0.18) + 80));
        }
        else if(salario > 4500.00){
        System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
        }
    }
}
