package lista4;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int N = 3;
        int vet[] = new int[N];
        int teste = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Informe um valor entre 0 a 20: ");
            teste = in.nextInt();
            while (teste < 0 || teste > 21) {
                System.out.println("Valor invalido!!");
                System.out.println("Informe novamente: ");
                teste = in.nextInt();
            }
            vet[i] = teste;
        }
        for (int i = 0; i < N; i++) {
            String a = new String(new char[vet[i]]).replace("\0", "#");
            System.out.println(vet[i] + " " + a);
        }

        in.close();
    }

}
