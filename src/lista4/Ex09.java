package lista4;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = "";
        System.out.print("Informe um texto: ");
        texto = in.nextLine();

        char[] vet = new char[texto.length()];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = texto.charAt(i);
            System.out.print(vet[i]+" | ");
        }

        in.close();
    }

}
