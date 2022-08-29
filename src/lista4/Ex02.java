package lista4;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10;
        float[] vet = new float[TAM];
        
        for(int i = 0; i<TAM; i++){
            System.out.print("Número posição ["+i+"]: ");
            vet[i] = in.nextFloat();
        }
        
        for(int i = TAM-1; i>=0; i--){
            System.out.print(vet[i]+" | ");
        }
        
        in.close();
    }

}
