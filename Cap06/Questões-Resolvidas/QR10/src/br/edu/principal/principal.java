package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gabarito[] = new char[8];
		char resposta[] = new char[8];
		int num, pontos, tot_ap, perc_ap, i, j;
		for (i = 0; i < 8; i++) {
			System.out.println("Digite a resposta da questão " + (i + 1) + ": ");
			gabarito[i] = sc.next().charAt(0);
		}
		tot_ap = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o número do " + (i + 1) + "° aluno: ");
			num = sc.nextInt();
			pontos = 0;
			for (j = 0; j < 8; j++) {
				System.out.println("Digite a resposta dada pelo aluno " + num + " à " + (j + 1) + "° questão: ");
				resposta[j] = sc.next().charAt(0);
				if (resposta[j] == gabarito[j]) {
					pontos += 1;
				}
			}
			System.out.println("A nota do aluno " + num + " foi " + pontos);
			if (pontos >= 6) {
				tot_ap += 1;
			}
		}
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual de alunos aprovados é: " + perc_ap);
		
		
		
		
		
	}

}
