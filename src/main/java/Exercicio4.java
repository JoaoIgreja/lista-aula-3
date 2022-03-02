import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int alunos;
        Scanner entrada = new Scanner(System.in);
        alunos = entrada.nextInt();

        switch (alunos){
            case 10:
            case 20:
                System.out.println("Sala I-15");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Sala não encontrada");
        }

    }
}
