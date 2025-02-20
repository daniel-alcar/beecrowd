import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        float n1 = ler.nextFloat();
        float n2 = ler.nextFloat();
        float n3 = ler.nextFloat();
        float n4 = ler.nextFloat();
        
        double med = (2*n1 + 3*n2 + 4*n3 + 1*n4) / 10;


        if(med >= 7.0){

            System.out.printf("Media: %.1f\n", med);
            System.out.println("Aluno aprovado.");


        

        }
        
            
            else if (med <= 4.9){

                System.out.printf("Media: %.1f\n", med);
                System.out.println("Aluno reprovado.");

            }

            else if(med >= 5.0 && med <= 6.9){

                System.out.printf("Media: %.1f\n", med);

                System.out.println("Aluno em exame.");

                float ntExa = ler.nextFloat(); 

                System.out.printf("Nota do exame: %.1f\n", ntExa);

                double novaMed = (med + ntExa) / 2; 

                    if (novaMed >= 5.0) {

                        System.out.println("Aluno aprovado.");
                        
                    }
                    else{

                        System.out.println("Aluno reprovado.");

                    }
                
                System.out.println(String.format("Media final: %.1f", novaMed));
                

            

        }

    }
}
