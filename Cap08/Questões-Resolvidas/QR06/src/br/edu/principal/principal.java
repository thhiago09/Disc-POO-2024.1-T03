package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int num;
	do {
		System.out.println("Digite um número entre 1 e 9");
		num= sc.nextInt();
		tabelaMultiplicacao(num);
	}while(num>=1 && num<9);
	
	}
	public static void tabelaMultiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
	}

}
