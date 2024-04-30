package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		maiormenor();

	}
	
	public static void maiormenor() {
		int i, num, maior = 0, menor = 0;
		for (i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o " + i + "° número: ");
			num = sc.nextInt();
			if (i == 1) {
				maior = num;
				menor = num;
			}else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);	
	}
	

}
