package exerciciosCondicionais;

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
            case 4:
                System.out.println("Você escolheu 4");
                exercicio4();
                break;
            default:
                System.out.println("Escolhe o numero certo, meu");
        }

        sc.close();
    }


    private static void exercicio1() {
        // Par ou impar ?

        Scanner sc = new Scanner(System.in);
        int numero;
        int result;

        System.out.println("Digite um número para saber se eh par ou impar: ");
        numero = sc.nextInt();

        result = numero % 2;

        if(result == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }

    private static void exercicio2() {

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Digite dois número para saber se eh multiplo: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("Multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }


        sc.close();
    }

    private static void exercicio3() {

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;
        int tempo;

        System.out.println("Horario de inicio: ");
        horaInicial = sc.nextInt();
        System.out.println("Horario de termino: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            tempo = horaFinal - horaInicial;
        } else {
            tempo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + tempo + " hora(s)");

        sc.close();
    }

    private static void exercicio4() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qnt;
        
        System.out.println("Digite o cod do produto: ");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade do produto");
        qnt = sc.nextInt();

        double preco;

        if(cod == 1) {
            preco = qnt * 4.00;
        } else if (cod == 2) {
            preco = qnt * 4.50;
        } else if (cod == 3) {
            preco = qnt * 5.00;
        } else if (cod == 4){
            preco = qnt * 2.00;
        } else {
            preco = qnt * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", preco);


        sc.close();
    }


}

