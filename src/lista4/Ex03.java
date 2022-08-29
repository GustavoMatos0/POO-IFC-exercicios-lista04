package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##.0");
        final int TAM = 4;
        float[] nota = new float[TAM];
        float soma = 0, media = 0;
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe a " + (i + 1) + "o nota: ");
            nota[i] = in.nextFloat();
            soma += nota[i];
        }
        media = (soma/nota.length);
        for (int i = 0; i < TAM; i++) {
            System.out.println((i + 1) + "o nota: " + nota[i]);
        }
        System.out.println("\nMédia: "+df.format(media));
        
        in.close();
    }

}
