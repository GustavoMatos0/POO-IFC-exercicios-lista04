package lista4;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int j = 0;
        final int TAM = 10, TAM3 = 20;
        int vet1[] = new int[TAM];
        int vet2[] = new int[TAM];
        int vet3[] = new int[TAM3];

        System.out.println("Informe o primeiro vetor: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Posição [" + i + "]: ");
            vet1[i] = in.nextInt();
        }

        System.out.println("Informe o segundo vetor: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Posição [" + i + "]: ");
            vet2[i] = in.nextInt();
        }

        for (int i = 0; i < TAM3; i += 2) {
            vet3[i] = vet1[j];
            vet3[i+1] = vet2[j];
            j++;
        }
        for (int i = 0; i < TAM3; i++) {
            System.out.print(vet3[i] + " | ");
        }
        
        in.close();
    }

}
