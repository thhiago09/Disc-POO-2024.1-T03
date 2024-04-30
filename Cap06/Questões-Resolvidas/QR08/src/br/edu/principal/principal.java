package br.edu.principal;

import java.util.Arrays;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int ind = 0;
        int[] vet1u2 = new int[10];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = sc.nextInt();
        }
        Arrays.sort(vetor1);
        Arrays.sort(vetor2);    
        int[] vetor1u2 = new int[10];
        for (int g = 0; g < 5; g++ ) {
        	vet1u2[ind++] = vetor1[g];
        }
        for (int g = 0; g < 5; g++ ) {
        	vet1u2[ind++] = vetor2[g];
		}
        for (int l = 0; l < vet1u2.length; l++) {
        	System.out.println("Valor armazenado no vetor união na posição " + l + ": " + vet1u2[l]);
        }

}
  }
