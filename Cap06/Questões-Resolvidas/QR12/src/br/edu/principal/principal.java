package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] consumo = new int[5];
		int menor_cons = 0;
		int menor_vei = 0;
		double valor;
		String[] veiculo = new String[5];
		System.out.println("Digite o nome de cada veículo:");
		for (int i = 0; i < 5; i++) {
		veiculo[i] = input.next();
		}
		System.out.println("Digite o consumo de cada veículo:");
		for (int i = 0; i < 5; i++) {
		consumo[i] = input.nextInt();
		if (i == 0 || consumo[i] < menor_cons) {
		menor_cons = consumo[i];
		menor_vei = i;
		}
		}
		valor = 1000.0 / consumo[menor_vei];
		System.out.println("O veículo com menor consumo é: " + veiculo[menor_vei]);
		System.out.println("Com consumo de: " + menor_cons);
		System.out.println("E valor por km: " + valor);
		}
		
		}
		
	


