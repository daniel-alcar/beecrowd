import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
    
        int N = ler.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = ler.nextInt();
            int y = ler.nextInt();

            if (x < y) {
                for (int j = x + 1; j < y; j++) {
                    
					if(j % 2 != 0) {
						soma += j;
					}
				}
			}else {
				for(int j = y + 1; j < x; j++) {
					if(j % 2 != 0) {
						soma += j;
					}
				}
			}
			System.out.println(soma);
		}
	}
}