import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int primeiraPartida;
        int segundaPartida;
        int terceiraPartida;
        int media;
        int somaTotal;

        Scanner entrada = new Scanner(System.in);
        primeiraPartida = entrada.nextInt();
        segundaPartida = entrada.nextInt();
        terceiraPartida = entrada.nextInt();

        somaTotal = primeiraPartida + segundaPartida + terceiraPartida;
        media = somaTotal / 3;

        System.out.println("Soma Total de zumbis mortos: " +
                somaTotal);
        System.out.println("Media de zumbis mortos: " +
                media);
    }

}
