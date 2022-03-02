import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int NPA;
        int NP3;
        int NFA;

        Scanner entrada = new Scanner(System.in);
        NPA = entrada.nextInt();

        if (NPA >= 60) {
            System.out.println("Passou");
        }
        else if(NPA <30){
            System.out.println("Reprovado");
        }

        if(NPA < 60 && NPA >=30) {
            System.out.println("Ficou de NP3");
            NP3 = entrada.nextInt();
            NFA = (NPA + NP3) / 2;
            if (NFA >= 50) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }



    }
}
