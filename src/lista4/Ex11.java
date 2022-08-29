package lista4;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe palavras separas por [;]: ");
        String palavras = in.nextLine();
        String vet[] = palavras.split(";");

        System.out.println("\nAs palavras digitadas foram: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        in.close();
    }

}
