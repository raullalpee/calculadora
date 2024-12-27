package dev.raullalpee.application.calculadora;

import java.util.Scanner;

public class Operacoes {
    private Scanner scanner = new Scanner(System.in);
    public int escolha = scanner.nextInt();
    private int numero1;
    private int numero2;

    public void multiplicar() {
        if (escolha == 1) {
            System.out.println("Digite o Número que está Multiplicando: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite o Número que vai Multiplicar:");
            numero2 = scanner.nextInt();
            Operacao multiplica = (a, b) -> a * b;
            System.out.println("O Resultado é: " + multiplica.operacao(numero1, numero2));
        }
    }

    public void adicao() {
        if (escolha == 2) {
            System.out.println("Digite a Primeira parcela: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite a Segunda parcela: ");
            numero2 = scanner.nextInt();
            Operacao adicao = (a, b) -> a + b;
            System.out.println("A Soma é: " + adicao.operacao(numero1, numero2));
        }
    }

    public void subtracao() {
        if (escolha == 3) {
            System.out.println("Digite o Minuendo: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite o Subtraendo: ");
            numero2 = scanner.nextInt();
            Operacao adicao = (a, b) -> a - b;
            System.out.println("A Diferença é: " + adicao.operacao(numero1, numero2));
        }
    }

    public void divisao() {
        if (escolha == 4) {
            System.out.println("Digite o Dividendo: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite o Divisor: ");
            numero2 = scanner.nextInt();
            Operacao adicao = (a, b) -> a / b;
            System.out.println("O Resto é: " + adicao.operacao(numero1, numero2));
        }
    }
}