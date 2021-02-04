package exerciciosRepet;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Entre com o número do exercicio de 1 a 6");
        num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Você escolheu 1");
                exercicio1();
                break;
            case 2:
                System.out.println("Você escolheu 2");
                exercicio2();
                break;
            case 3:
                System.out.println("Você escolheu 3");
                exercicio3();
                break;
            default:
                System.out.println("Escolhe o numero certo, meu");
        }

        sc.close();
    }

    private static void exercicio3() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        int N;

        System.out.println("Digite o numero de repeticoes ");
        N = sc.nextInt();

        for ( int i = 0; i < N; i ++ ) {
            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextDouble();
            System.out.println("Digite a nota 3: ");
            nota3 = sc.nextDouble();

            media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.00) / 10.0;
            System.out.printf("Media: %.1f\n", media);

        }

        sc.close();

    }

    private static void exercicio2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de repetiçoes");
        int N = sc.nextInt();
        int X;

        int in = 0;
        int out = 0;

        for(int i = 1; i <= N; i ++) {
                System.out.println("Digite um numero: ");
                X = sc.nextInt();

                if (X <= 20 && X >= 10) {
                    in += 1;
                } else {
                    out += 1;
            }
        }

        System.out.println( in + " in");
        System.out.println( out + " out");


        sc.close();
    }

    private static void exercicio1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}

