import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int cod, qtd;
        double pagar;

        cod = ler.nextInt();
        qtd = ler.nextInt();

        switch (cod) {
            case 1:
                pagar = qtd * 4.00;
                System.out.println(String.format("Total: R$ %.2f", pagar));
                break;
            case 2:
                pagar = qtd * 4.50;
                System.out.println(String.format("Total: R$ %.2f", pagar));
                break;
            case 3:
                pagar = qtd * 5.00;
                System.out.println(String.format("Total: R$ %.2f", pagar));
                break;
            case 4:
                pagar = qtd * 2.00;
                System.out.println(String.format("Total: R$ %.2f", pagar));
                break;
            case 5:
                pagar = qtd * 1.50;
                System.out.println(String.format("Total: R$ %.2f", pagar));
                break;
        }



        ler.close();
    }
}
