package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] vetor = new int[8];

	        System.out.println("Digite 8 números inteiros:");

	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = scanner.nextInt();
	            Arrays.sort(vetor, 0, i+1);
	        }

	        System.out.println("Vetor ordenado:");
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }
		}
	}


