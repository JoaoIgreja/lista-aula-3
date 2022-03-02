import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int numero=0;

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        while(numero!=x){

            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();

            if(numero>x)
            {
                System.out.println("Maior que x");
            }
            else if(numero<x){
                System.out.println("Menor que x");
            }
        }

    }
}
