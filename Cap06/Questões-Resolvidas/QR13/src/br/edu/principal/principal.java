package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vet = new int[10];
		boolean achou = false;
		System.out.println("Digite os valores do vetor (10 elementos):");
		for (int i = 0; i < 10; i++) {
		vet[i] = input.nextInt();
		}
		for (int i = 0; i < 10; i++) {
		if (vet[i] > 50) {
		System.out.println("Valor: " + vet[i] + ", Posição: " + (i + 1));
		achou = true;
		}
		}
		if (!achou) {
		System.out.println("Não existem números superiores a 50 no vetor");
		}
		}
	}


