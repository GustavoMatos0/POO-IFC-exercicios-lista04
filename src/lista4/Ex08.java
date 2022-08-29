package lista4;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        char senhaal;
        String senha = "";
        char alf[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'y', 'x', 'z'};
        int tam = 0;
        do {
            System.out.println("Informe o tamanho da senha (até 21 caracteres): ");
            tam = in.nextInt();
        } while (tam > alf.length);

        for (int k = 0; k < tam; k++) {
            if (k % 2 == 0) {
                do {
                    senhaal = alf[aleatorio.nextInt(26)];
                } while (senhaal == 'a' || senhaal == 'e' || senhaal == 'i' || senhaal == 'o' || senhaal == 'u');
                senha = senha + senhaal;
            } else {

                do {
                    senhaal = alf[aleatorio.nextInt(26)];
                } while (senhaal != 'a' && senhaal != 'e' && senhaal != 'i' && senhaal != 'o' && senhaal != 'u');
                senha = senha + senhaal;
            }
        }

        System.out.println("A senha gerada foi: " + senha);

        in.close();
    }

}
