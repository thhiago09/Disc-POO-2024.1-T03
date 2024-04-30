package br.edu.principal;

import java.util.Scanner;

import br.edu.principal.SubRotina;

public class principal {

	public static void main(String[] args) {
		
		double patual, pantigo, acrescimo;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Qual o preço antigo do produto?");
		pantigo= sc.nextDouble();
		
		System.out.println("Qual o preço atual do produto?");
		patual= sc.nextDouble();
		
		acrescimo= SubRotina.reajuste(pantigo, patual);
		System.out.print("O valor do produto aumentou em "+acrescimo+"%");
	}

}
