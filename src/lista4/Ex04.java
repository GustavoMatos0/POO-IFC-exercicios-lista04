package lista4;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totcon = 0;
        final int TAM = 10;
        char[] vet = new char[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Caractere posição [" + i + "]: ");
            vet[i] = in.nextLine().charAt(0);
        }

        for (int i = 0; i < TAM; i++) {
            if (vet[i] != 'a' && vet[i] != 'e' && vet[i] != 'i' && vet[i] != 'o' && vet[i] != 'u') {
                System.out.println("Consoante: " + vet[i]);
                totcon++;
            }
        }

        System.out.println("Total de consoantes: " + totcon);
        in.close();
    }
}
