import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        
        for(int i = 1, j = 60; j >= 0; i +=3, j -=5){
			System.out.print("I="+ i +" J="+ j +"\n");
		}
    }
}
