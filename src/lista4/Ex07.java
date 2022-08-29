package lista4;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Faça um Programa que leia um vetor de 5 números inteiros, mostre a
soma, a multiplicação e os números.
        */
        int soma = 0, mul = 1;
        float div = 0;
        final int TAM= 5;
        int[] vet = new int[TAM];
        
        for(int i = 0; i< TAM; i++){
            System.out.print("Informe um número inteiro: ");
            vet[i] = in.nextInt();
            soma += vet[i];
            mul *= vet[i];
        }
        
        for(int i = 0; i <TAM; i++){
            System.out.println("Número posição ["+i+"]: "+vet[i]);
        }
        
        System.out.println("Soma: "+soma);
        System.out.println("Multiplicação: "+mul);
        
        in.close();
    }

}
