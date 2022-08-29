package lista4;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 5;
        int[] vet = new int[TAM];
        
        for(int i = 0; i<TAM; i++){
            System.out.print("Informe número da posição ["+i+"]: ");
            vet[i] = in.nextInt();
        }
        
        for(int i = 0; i <TAM; i++){
            System.out.print(vet[i]+" | ");
        }
        
        in.close();
    }

}
