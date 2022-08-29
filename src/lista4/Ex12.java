package lista4;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int maioridade = 0, menoridade = 0, pmaioridade = 0, pmenoridade = 0, pmaioral = 0, pmenoral = 0, mIdade = 0;
        float maioral = 0, menoral = 0, mAl = 0;
        float vet[][] = new float[TAM][2];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Idade: ");
            vet[i][0] = in.nextInt();
            System.out.print("Altura:");
            vet[i][1] = in.nextFloat();
            mIdade += vet[i][0];
            mAl += vet[i][1];
            if (i == 0) {
                maioridade = (int) vet[i][0];
                menoridade = (int) vet[i][0];
                maioral = vet[i][1];
                menoral = vet[i][1];
            } else {
                if (vet[i][0] > maioridade) {
                    maioridade = (int) vet[i][0];
                    pmaioridade = i;
                }
                if (vet[i][1] > maioral) {
                    maioral = vet[i][1];
                    pmaioral = i;
                }
                if (vet[i][0] < menoridade) {
                    menoridade = (int) vet[i][0];
                    pmenoridade = i;
                }
                if (vet[i][1] < menoral) {
                    menoral = vet[i][1];
                    pmenoral = i;
                }
            }
        }

        mIdade /= TAM;
        mAl /= TAM;

        for (int i = (TAM - 1); i >= 0; i--) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.println("Idade: " + (int) vet[i][0]);
            System.out.println("Altura: " + vet[i][1]);
        }
        System.out.println("Média de idade: " + mIdade);
        System.out.println("\nMédia de altura: " + mAl);

        System.out.println("\nPessoa mais velha número: " + (pmaioridade + 1));
        System.out.println("Idade: " + (int) vet[pmaioridade][0] + " ano(s)");
        System.out.println("Altura: " + vet[pmaioridade][1] + " metro(s)");

        System.out.println("\nPessoa mais nova número: " + (pmenoridade + 1));
        System.out.println("Idade: " + (int) vet[pmenoridade][0] + " ano(s)");
        System.out.println("Altura: " + vet[pmenoridade][1] + " metro(s)");

        System.out.println("\nPessoa mais alta número: " + (pmaioral + 1));
        System.out.println("Idade: " + (int) vet[pmaioral][0] + " ano(s)");
        System.out.println("Altura: " + vet[pmaioral][1] + " metro(s)");

        System.out.println("\nPessoa mais baixa número: " + (pmenoral + 1));
        System.out.println("Idade: " + (int) vet[pmenoral][0] + " ano(s)");
        System.out.println("Altura: " + vet[pmenoral][1] + " metro(s)");

        System.out.println("\nPessoas a cima e a baixo das médias de idade e altura: ");
        for (int i = 0; i < TAM; i++) {
            if (vet[i][0] > mIdade && vet[i][1] > mAl) {
                System.out.println("\nPessoa número " + (i + 1) + " a cima da média:");
                System.out.println("Idade: " + vet[i][0]);
                System.out.println("Altura: " + vet[i][1]);
            } else {
                System.out.println("\nPessoa número " + (i + 1) + " a baixo da média:");
                System.out.println("Idade: " + vet[i][0]);
                System.out.println("Altura: " + vet[i][1]);
            }
        }
        in.close();
    }

}
