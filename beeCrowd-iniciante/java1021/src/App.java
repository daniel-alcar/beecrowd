import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner ler = new Scanner(System.in);


        double valor = ler.nextDouble();

        int resul;

        System.out.println("NOTAS:");

        resul = (int) valor / 100;

        System.out.println(resul + " nota(s) de R$ 100.00");

        valor = valor % 100;
        resul = (int)valor/50;
        System.out.println(resul + " nota(s) de R$ 50.00");
        valor = valor % 50;
        resul = (int)valor/20;
        System.out.println(resul + " nota(s) de R$ 20.00");
        valor = valor % 20;
        resul = (int)valor/10;
        System.out.println(resul + " nota(s) de R$ 10.00");
        valor = valor % 10;
        resul = (int)valor/5;
        System.out.println(resul + " nota(s) de R$ 5.00");
        valor = valor % 5;
        resul = (int)valor/2;
        System.out.println(resul + " nota(s) de R$ 2.00");
        valor = valor%2;


        valor = valor * 100;

        System.out.println("MOEDAS:");

        resul = (int)valor/100;
        System.out.println(resul + " moeda(s) de R$ 1.00");
        valor = valor%100;
        resul = (int)valor/50;
        System.out.println(resul + " moeda(s) de R$ 0.50");
        valor = valor%50;
        resul = (int)valor/25;
        System.out.println(resul + " moeda(s) de R$ 0.25");
        valor = valor%25;
        resul = (int)valor/10;
        System.out.println(resul + " moeda(s) de R$ 0.10");
        valor = valor%10;
        resul = (int)valor/5;
        System.out.println(resul + " moeda(s) de R$ 0.05");
        valor = valor%5;
        resul = (int)valor/1;
        System.out.println(resul + " moeda(s) de R$ 0.01");


        ler.close();

    }
}
