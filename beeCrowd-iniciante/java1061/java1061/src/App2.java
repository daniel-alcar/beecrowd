import java.util.Scanner;
import java.util.Locale;

public class App2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int diaInicial = ler.nextInt();
        int horaInicial = ler.nextInt();
        int minutoInicial = ler.nextInt();
        int segundoInicial = ler.nextInt();

        int diaFinal = ler.nextInt();
        int horaFinal = ler.nextInt();
        int minutoFinal = ler.nextInt();
        int segundoFinal = ler.nextInt();


        int SegundosEvento = ((diaFinal - diaInicial) *86400) + ((horaFinal - horaInicial) * 3600) + ((minutoFinal - minutoInicial) * 60) + (segundoFinal - segundoInicial);

        int diaTotal = SegundosEvento / 86400;
        SegundosEvento %=86400;
        int horaTotal = SegundosEvento / 3600;
        SegundosEvento %= 3600;
        int minutoTotal = SegundosEvento / 60;
        int segundoTotal = SegundosEvento % 60;


        System.out.println(diaTotal + " dia(s)");
        System.out.println(horaTotal + " hora(s)");
        System.out.println(minutoTotal + " minuto(s)");
        System.out.println(segundoTotal + " segundo(s)");
    }

}
