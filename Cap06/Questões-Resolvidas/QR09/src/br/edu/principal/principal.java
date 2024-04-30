package br.edu.principal;

import java.util.Scanner;

import java.util.Arrays;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voo[] = new int[12];
		int lugares[] = new int[12];
		int i, op, op2, num_voo;
		String origem[] = new String[12];
		String destino[] = new String[12];
		String local;
		for (i = 1; i < 5; i++) {
			System.out.println("Digite o número do voo: ");;
			voo[i] = sc.nextInt();
			System.out.println("Digite a origem do voo: ");
			origem[i] = sc.next();
			System.out.println("Digite o destino do voo: ");
			destino[i] = sc.next();
			System.out.println("Digite aqui o número de lugares disponíveis: ");
			lugares[i] = sc.nextInt();
		}
		System.out.println("Digite sua opção: \n 1- Consultar \n 2- Reservar \n 3- Finalizar");
		op = sc.nextInt();
		if (op == 1) {
			System.out.println("Digite sua opção: \n 1- Consulta por voo \n 2- Consulta por origem \n 3- Consulta por destino ");
			op2 = sc.nextInt();
			if (op2 == 1) {
				System.out.println("Digite o número do voo: ");
				num_voo = sc.nextInt();
				i = 1;
				while (i <= 12 && voo[i] != num_voo) {
					i += 1;
				}
				if (i > 12) {
					System.out.println("Voo inexistente!");
				}else {
					System.out.println("Número do voo: " + voo[i]);
					System.out.println("Local de origem: " + origem[i]);
					System.out.println("Local de destino: " + destino[i]);
					System.out.println("Lugares disponíveis: " + lugares[i]); 
				}
			}if (op2 == 2) {
				System.out.println("Digite o local de origem: ");
				local = sc.next();
				for (i = 1; i < 12; i++) {
					if (local == origem[i]) {
						System.out.println("Número do voo: " + voo[i]);
						System.out.println("Local de origem: " + origem[i]);
						System.out.println("Local de destino: " + destino[i]);
						System.out.println("Lugares disponíveis: " + lugares[i]);
					}
					
					
				}
			}if (op2 == 3) {
				System.out.println("Digite o local de destino: ");
				local = sc.next();
				for (i = 1; i < 12; i++) {
					if(local == destino[i]) {
						System.out.println("Número do voo: " + voo[i]);
						System.out.println("Local de origem: " + origem[i]);
						System.out.println("Local de destino: " + destino[i]);
						System.out.println("Lugares disponíveis: " + lugares[i]);
					  }
					}
				}
				
		}if (op == 2) {
			System.out.println("Digite o número do voo desejado: ");
			num_voo = sc.nextInt();
			i = 1;
			while (i <= 12 && voo[i] != num_voo) {
				i += 1;
			}if (i > 12) {
				System.out.println("Número de voo não encontrado!");
			}else {
				if (lugares[i] == 0) {
					System.out.println("Voo lotado");
				}else {
					lugares[i] = lugares[i] - 1;
					System.out.println("Reserva confirmada!");
				}
				
			}
		
		} while (op != 3);
		
	}

}
