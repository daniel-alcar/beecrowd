import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;

        String[] diaInicial = ler.nextLine().split(" ");
        String[] horaInicial = ler.nextLine().replaceAll(" ", "").split(":");
        String[] diaFinal = ler.nextLine().split(" ");
        String[] horaFinal = ler.nextLine().replaceAll(" ","").split(":");

        int diaInicial2 = Integer.parseInt(diaInicial[1]);
        int diaFinal2 = Integer.parseInt(diaFinal[1]);
        int horaInicial2 = Integer.parseInt(horaInicial[0]);
        int horaFinal2 = Integer.parseInt(horaFinal[0]);
        int minutoInicial2 = Integer.parseInt(horaInicial[1]);
        int minutoFinal2 = Integer.parseInt(horaFinal[1]);
        int segundoInicial2 = Integer.parseInt(horaInicial[2]);
        int segundoFinal2 = Integer.parseInt(horaFinal[2]);

        if (segundoFinal2 < segundoInicial2) {
        	totalSegundos += (60 - segundoInicial2) + segundoFinal2;
        	totalMinutos--;
        } 
        else if (segundoFinal2 > segundoInicial2) {
        	totalSegundos += segundoFinal2 - segundoInicial2;
        } 
        else if(segundoFinal2 == 0 && segundoInicial2 == 0){
        	totalSegundos = 0;
        }

        if(minutoFinal2 < minutoInicial2){
            totalMinutos += (60 - minutoInicial2) + minutoFinal2;
            totalHoras--;
        }
        else if(minutoFinal2 > minutoInicial2){
            totalMinutos += minutoFinal2 - minutoInicial2; 
        }
        else if(minutoFinal2 == 0 && minutoInicial2 == 0){
            totalMinutos = 0;
        }
        if (horaFinal2 < horaInicial2) {
        	totalHoras += (24 - horaInicial2) + horaFinal2;
        	totalDias--;
        } 
        else if (horaFinal2 > horaInicial2) {
        	totalHoras += horaFinal2 - horaInicial2;
        } 
        else if(horaFinal2 == 0 && horaInicial2 == 0){
        	totalHoras = 0;
        }
        if (diaFinal2 < diaInicial2) {
        	totalDias += (30 - diaInicial2) + diaFinal2;
        } 
        else if (diaFinal2 > diaInicial2) {
        	totalDias += diaFinal2 - diaInicial2;
        } 
        else if(diaFinal2 == 0 && diaInicial2 == 0) {
        	totalDias = 0;
        }
                
        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");
    }
	
}