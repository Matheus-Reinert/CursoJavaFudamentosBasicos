package entradaDeDados2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //consumindo quebra de linha com sc.nextLine();

        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: " );
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


/*
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        System.out.println("Digita uma frase aí: ");
        s1 = sc.nextLine();
        System.out.println("Digita outra frase aí: ");
        s2 = sc.nextLine();
        System.out.println("Digita só mais uma frase aí: ");
        s3 = sc.nextLine();

        System.out.println("Você digitou: " + s1 + " " + s2 + " " + s3);
*/

        sc.close();
    }
}
