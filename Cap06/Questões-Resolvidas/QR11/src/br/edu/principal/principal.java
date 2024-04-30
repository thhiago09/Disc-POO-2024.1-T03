package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp[] = new int[12];
		int cont, maior = 0, menor = 0, maior_mes = 0, menor_mes = 0;
		for (cont = 0; cont < 12; cont++) {
			System.out.println("Digite a temperatura do mês " + (cont + 1) + ": ");
			temp[cont] = sc.nextInt();
			if (cont == 1) {
				maior = temp[cont];
				menor = temp[cont];
				maior_mes = cont;
				menor_mes = cont;
				
			}else {
				if (temp[cont] > maior) {
					maior = temp[cont];
					maior_mes = cont;
					
				}if (temp[cont] < menor) {
					menor = temp[cont];
					menor_mes = cont;
				}
			}
		}
		System.out.println(maior);
		switch(maior_mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Erro!");
		}
		switch(menor_mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Erro!");
		}
	}

}
