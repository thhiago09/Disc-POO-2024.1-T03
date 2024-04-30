package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nome = new String[5];
		double[] sal = new double[5];
		int[] quant = new int[5];
		double novo_sal;
		System.out.println("Digite os dados dos funcionários:");
		for (int i = 0; i < 5; i++) {
		System.out.println("Funcionário " + (i + 1) + ":");
		System.out.print("Nome: ");
		nome[i] = input.next();
		System.out.print("Salário: ");
		sal[i] = input.nextDouble();
		System.out.print("Quantidade de produtos vendidos: ");
		quant[i] = input.nextInt();
		}
		System.out.println("Funcionários com quantidade vendida menor ou igual a 5 e salário maior ou igual a 800:");
		for (int i = 0; i < 5; i++) {
		if (quant[i] <= 5 && sal[i] >= 800) {
		System.out.println(nome[i]);
		}
		}
		System.out.println("\nNovos salários:");
		for (int i = 0; i < 5; i++) {
		if (quant[i] > 5 || sal[i] < 800) {
		if (quant[i] > 5 && sal[i] < 800) {
		novo_sal = sal[i] + sal[i] * 0.35;
		} else if (quant[i] > 5) {
		novo_sal = sal[i] + sal[i] * 0.25;
		} else {
		novo_sal = sal[i] + sal[i] * 0.15;
		}
		System.out.println(nome[i] + ", Novo Salário: " + novo_sal);
		}
		}
		}
		
	}

