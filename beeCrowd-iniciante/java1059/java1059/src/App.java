
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        for (int i = 1; i <= 100; i++) {
            if(i%2 == 00){
                System.out.println(i);
            }
        }
    }
}
