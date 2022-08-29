package lista4;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int AL = 5, INFO = 2;
        float aluno[][] = new float[AL][INFO];
        float mediaal = 0;
        int total = 0;
        for (int i = 0; i < AL; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Idade: ");
            aluno[i][0] = in.nextInt();
            System.out.print("Altura: ");
            aluno[i][1] = in.nextFloat();
            mediaal += aluno[i][1];
        }
        mediaal /= AL;

        System.out.println("\nMédia de altura da sala: " + mediaal + " metros");
        for (int i = 0; i < AL; i++) {
            if (aluno[i][0] > 13 && aluno[i][1] < mediaal) {
                total++;
            }
        }
        System.out.println("Foram registrados " + total + " alunos maiores de 13 anos com altura inferior a média da turma.");

        in.close();
    }

}
