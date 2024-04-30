package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Digite as três notas do aluno:");
	        double nota1 = scanner.nextDouble();
	        double nota2 = scanner.nextDouble();
	        double nota3 = scanner.nextDouble();
	        
	        System.out.println("Digite A para média aritmética ou P para média ponderada:");
	        char opcao = scanner.next().charAt(0);
	        
	        
	        double media = calcularMedia(nota1, nota2, nota3, opcao);
	        System.out.println("A média do aluno é: " + media);
	        
	        scanner.close();
	    }

	    public static double calcularMedia(double nota1, double nota2, double nota3, char opcao) {
	        double media = 0;
	        if (opcao == 'A' || opcao == 'a') {
	          
	            media = (nota1 + nota2 + nota3) / 3;
	        } else if (opcao == 'P' || opcao == 'p') {
	            media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
	        } else {
	            System.out.println("Opção inválida. Por favor, digite A para média aritmética ou P para média ponderada.");
	        }
	        return media;
	    }
		}
	


