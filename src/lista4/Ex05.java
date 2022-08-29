package lista4;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totpar = 0, totimpar = 0, p = 0, imp = 0;
        final int TAM = 20;
        int[] vet = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um valor inteiro: ");
            vet[i] = in.nextInt();
            if (vet[i] % 2 == 0) {
                totpar++;
            } else {
                totimpar++;
            }
        }

        int[] par = new int[totpar];

        int[] impar = new int[totimpar];

        System.out.print("Vetor: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(vet[i] + " | ");
            if (vet[i] % 2 == 0) {
                par[p] = vet[i];
                p++;
            } else {
                impar[imp] = vet[i];
                imp++;
            }
        }

        System.out.println("\nVetor de pares:");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + " | ");
        }
        System.out.println("\nVetor de impares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i] + " | ");
        }

        in.close();
    }

}
