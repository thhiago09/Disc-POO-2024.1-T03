package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		int[] vet= new int[10];
		int i, j, aux;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 números");
		for (i=0; i<=9;i++) {
			vet[i]=sc.nextInt();
		}
		for (i=0;i<=9;i++) {
			for (j=0;j<=8;j++) {
				if(vet[j]<vet[j+1]) {
					aux=vet[j];
					vet[j]=vet[j+1];
					vet[j+1]=aux;
				}
			}
		}
		for (i=0;i<=9;i++) {
			System.out.println(vet[i]);
		}
	}

}
