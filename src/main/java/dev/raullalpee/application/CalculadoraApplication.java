package dev.raullalpee.application;

import dev.raullalpee.application.calculadora.Operacoes;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Operacoes operacao = new Operacoes();

		while (operacao.escolha != 5) {
			System.out.println("===== Calculadora =====");
			System.out.println("1. Multiplicação");
			System.out.println("2. Adição");
			System.out.println("3. Subtração");
			System.out.println("4. Divisão");
			System.out.println("=======================");
			operacao.escolha = scanner.nextInt();

			operacao.multiplicar();
			operacao.adicao();
			operacao.subtracao();
			operacao.divisao();
		}
	}
}