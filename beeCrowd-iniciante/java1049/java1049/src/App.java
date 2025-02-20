import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        String palavra1 = ler.nextLine();
        String palavra2 = ler.nextLine();
        String palavra3 = ler.nextLine(); 

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("ave")){ 
                if(palavra3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }
                else if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("pomba");
                }
            }
            else if(palavra2.equalsIgnoreCase("mamifero")){
                if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }
                else if(palavra3.equalsIgnoreCase("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
        
        if (palavra1.equalsIgnoreCase("invertebrado")) {
            if(palavra2.equalsIgnoreCase("inseto")){ 
                if(palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }
                else if(palavra3.equalsIgnoreCase("herbivoro")){
                    System.out.println("lagarta");
                }
            }
            else if(palavra2.equalsIgnoreCase("anelideo")){
                if(palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
