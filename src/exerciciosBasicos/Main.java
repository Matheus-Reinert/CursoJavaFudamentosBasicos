package exerciciosBasicos;

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
            case 5:
                System.out.println("Você escolheu 5");
                exercicio5();
                break;
            case 6:
                System.out.println("Você escolheu 6");
                exercicio6();
                break;
            default:
                System.out.println("Escolhe o numero certo, meu");
        }

        sc.close();
    }

    private static void exercicio6() {
        // Exercício 6

        System.out.println("Exercício 6");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X, Y, Z;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite X, Y, Z na respectiva sequencia");
        X = sc.nextDouble();
        Y = sc.nextDouble();
        Z = sc.nextDouble();

        triangulo = X * Z / 2;
        circulo = Math.PI * Math.pow(Z,2);
        trapezio = ((X + Y) * Z) / 2;
        quadrado = Y * Y;
        retangulo = X * Y;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();
    }

    private static void exercicio5() {

        // Exercício 5
        System.out.println("Exercício 5");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int codPeca1, qntPeca1, codPeca2, qntPeca2;
        double valorUnidPeca1, valorUnidPeca2, valorFinal;

        System.out.println("Codigo da peca 1: ");
        codPeca1 = sc.nextInt();
        System.out.println("Quantidade da peca 1: ");
        qntPeca1 = sc.nextInt();
        System.out.println("Valor unitario peca 1: ");
        valorUnidPeca1 = sc.nextDouble();
        System.out.println("Codigo da peca 2: ");
        codPeca2 = sc.nextInt();
        System.out.println("Quantidade da peca 2: ");
        qntPeca2 = sc.nextInt();
        System.out.println("Valor unitario peca 2: ");
        valorUnidPeca2 = sc.nextDouble();

        valorFinal = qntPeca1 * valorUnidPeca1 + qntPeca2 * valorUnidPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
        System.out.println("");

        sc.close();
    }

    private static void exercicio4() {

        // Exercício 4
        System.out.println("Exercício 4");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cif;
        double horasTrabalhadas;
        double salario;
        double valorHora;

        System.out.println("Digite a CIF do funcionário: ");
        cif = sc.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor por hora: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", cif, salario);
        System.out.println("");

        sc.close();
    }

    private static void exercicio3() {
        // Exercício 3
        System.out.println("Exercício 3");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite A: ");
        A = sc.nextInt();
        System.out.println("Digite B: ");
        B = sc.nextInt();
        System.out.println("Digite C: ");
        C = sc.nextInt();
        System.out.println("Digite D: ");
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERNCA: " + diferenca);

        sc.close();
    }

    private static void exercicio2() {
        System.out.println("Exercício 2");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.printf("Digite o raio: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }

    private static void exercicio1() {

        System.out.println("Exercício 1");

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Digite A: ");
        A = sc.nextInt();
        System.out.println("Digite B: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
