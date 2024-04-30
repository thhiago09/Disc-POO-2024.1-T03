package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int[] x= new int[10]; 
		int[] y= new int[10];
		int[] u= new int[10];
		int[] d= new int[10];
		int[] s= new int[10];
		int[] p= new int[10];
		int[] it= new int[10];
		int i, j, k, contu, contd, conti;
        Scanner sc = new Scanner(System.in);
		for (i=0; i<=9;i++) {
			System.out.println("Digite um número para a lista X");
			x[i]=sc.nextInt();
			System.out.println("Digite um número para a lista Y");
			y[i]=sc.nextInt();
			
		}
		
		contu =1;
		contd = 1;
		conti = 1;
		for(i=0;i<=9;i++) {
			j=0;
			while(j<contu && x[i]!=u[j]) {
				j++;
			}
			if(j>= contu) {
				u[contu]=x[i];
				contu=contu+1;
			}
		}
		for(i=0;i<=9;i++) {
			j=0;
			while(j<contu && y[i]!=u[j]) {
				j=j+1;
			}
			if(j>=contu) {
				u[contu]=y[i];
				contu=contu+1;
			}
		}
		System.out.println("A união das listas é: ");
		for (i=0;i<=(contu-1);i++) {
			System.out.println(u[i]);
		}
		for(i=0; i<=9;i++) {
			j=0;
			while(x[i]!=y[j] && j<=9) {
				j=j+1;
			}
			if (j>9) {
				k=0;
				while(k<contd && x[i]!=d[k]) {
					k=k+1;
				}
				if (k>=contd) {
					d[contd]=x[i];
					contd=contd+1;
				}
			}
			
		}
		System.out.println("A diferença das listas é: ");
		for (i=0; i<=(contd-1); i++) {
			System.out.println(d[i]);
		}
		for (i=0; i<=9; i++) {
			s[i]=x[i]+y[i];
			p[i]=x[i]*y[i];
		}
		System.out.println("A soma das listas é: ");
		for (i=0; i<=9;i++) {
			System.out.println(s[i]);
		}
		System.out.println("O produto das listas é:");
		for (i=0; i<=9; i++) {
			System.out.println(p[i]);
		}
		for (i=0; i<=9; i++) {
			j=0;
			while(j<=9 && x[i]!=y[i]) {
				j=j+1;
			}
			if(j<=9) {
				k=1;
			while (k<conti && it[k]!= x[i]) {
				k=k+1;
			}
			if  (k>=conti) {
				it[conti]=x[i];
				conti=conti+1;
			}
			}
		}
		System.out.println("A intersecção entre as listas é:");
		for (i=0; i<=(conti-1);i++) {
			System.out.println(it[i]);
		}

		
	}

}
