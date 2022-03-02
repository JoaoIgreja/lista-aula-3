import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        int numero=0;

        Random rand = new Random();
        int x = rand.nextInt(10)+1;//Gera número entre 1 e 10

        while(numero!=x) {

            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();

        }


    }
}
