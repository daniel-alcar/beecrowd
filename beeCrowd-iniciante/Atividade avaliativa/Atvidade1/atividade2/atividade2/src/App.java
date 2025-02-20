import java.util.Locale;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Volta " + i + ":");
                    for (int j = 1; j <= 50; j++) {
                        System.out.println("Abdominal " + j);
                        
                    }
            }
            else{
                System.out.println("Volta " + i + ":");
                    for (int h = 1; h <= 50; h++) {
                        System.out.println("Flexão " + h);
                        
                    }
            }
        }
    }
}
