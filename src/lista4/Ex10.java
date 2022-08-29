package lista4;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = "";
        String data[] = new String[3];

        while (true) {
            System.out.print("Informe uma data no padrão dd/mm/aaaa: ");
            date = in.nextLine();
            data = date.split("/");
            if ((Integer.parseInt(data[0]) > 30 || Integer.parseInt(data[0]) < 1) || (Integer.parseInt(data[1]) > 12 || Integer.parseInt(data[0]) < 1) || (Integer.parseInt(data[2]) > 2022 || Integer.parseInt(data[2]) < 1900)) {
                System.out.println("Data invalida!!!");
            } else {
                break;
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                System.out.print("/" + data[i]);
            } else {
                System.out.print(data[i]);
            }
        }
        System.out.println("\nData aceita");
        in.close();
    }

}
