package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.0");

        float media = 0;
        int soma = 0, total = 0;
        final int TAM = 5;

        float[] almedia = new float[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Aluno: " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                soma += in.nextFloat();
            }
            media = (float) soma / 4;
            almedia[i] = media;
            soma = 0;
            media = 0;
        }

        for (int i = 0; i < TAM; i++) {
            if (almedia[i] >= 7) {
                System.out.println("Aluno " + (i + 1) + " acima da média com nota: " + df.format(almedia[i]));
                total++;
            }
        }
        System.out.println("Total de " + total + " alunos acima da média.");

        in.close();
    }

}
