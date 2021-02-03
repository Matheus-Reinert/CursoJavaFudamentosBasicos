package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SCANNER PARA CHAR

        Scanner sc = new Scanner(System.in);

        char x;

        System.out.println("Digita uma letra aí: ");
        x = sc.next().charAt(0);

        System.out.println("Você digitou: " + x);

/*
        ******** SCANNER COM DOUBLE ******
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x;

        System.out.println("Digita um número aí: ");
        x = sc.nextDouble();

        System.out.printf("Você digitou: %.1f\n", x);
*/


/*
        **** SCANNER PARA INT ****
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digita um número aí: ");
        x = sc.nextInt();

        System.out.println("Você digitou: " + x);
*/

/*
        ****SCANNER PARA STRING****

        Scanner sc = new Scanner(System.in);
        String x;
        String y;

        System.out.println("Digita algo aí: ");
        x = sc.next();

        System.out.println("Digita algo aí de novo: ");
        y = sc.next();

        System.out.println("Você digitou: " + x + " " + y);
*/
        sc.close();

    }
}
