package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int[] vet = new int[3];
		perfeitos(vet);
		for (int i = 0; i < 3; i++) {
		System.out.println(vet[i]);
		}
		}
		public static void perfeitos(int[] v) {
		int a, r, num, soma, cont;
		cont = 0;
		num = 1;
		while (cont < 3) {
		soma = 0;
		for (a = 1; a < num; a++) {
		r = num % a;
		if (r == 0) {
		soma += a;
		}
		}
		if (soma == num) {
		v[cont] = num;
		cont++;
		}
		num++;
		}
		
		}
		
		}
		
	


