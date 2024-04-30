package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		for (int x = 0; x < 10; x++) {
		vet1[x] = scanner.nextInt();
		}
		fatoriais(vet1, vet2);
		for (int x = 0; x < 10; x++) {
		System.out.println(vet2[x]);
		}
		scanner.close();
		}
		public static void fatoriais(int[] a, int[] b) {
		for (int i = 0; i < 10; i++) {
		if (a[i] == 0 || a[i] == 1) {
		b[i] = 1;
		} else {
		b[i] = 1;
		for (int j = 1; j <= a[i]; j++) {
		b[i] *= j;
		}
		}
		}
		}
	}


