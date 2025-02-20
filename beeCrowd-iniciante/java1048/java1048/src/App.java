import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double salario = ler.nextDouble();
        double reajuste;
        double novoSalario;

        if( salario >= 0 && salario <= 400.00){
            reajuste = 0.15 * salario;
            novoSalario = reajuste + salario;
            
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 15 %");
        
        }

        else if(salario >= 400.01 && salario <= 800.00){
            reajuste = 0.12 * salario;
            novoSalario = reajuste + salario;
            
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 12 %");
        
        }

        else if(salario >= 800.01 && salario <= 1200.00){
            reajuste = 0.10 * salario;
            novoSalario = reajuste + salario;
            
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 10 %");
        
        }

        else if(salario >= 1200.01 && salario <= 2000.00){
            reajuste = 0.07 * salario;
            novoSalario = reajuste + salario;
            
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 7 %");
        
        }

        else if(salario > 2000.00){
            reajuste = 0.04 * salario;
            novoSalario = reajuste + salario;
            
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 4 %");
        
        }
    }
}
