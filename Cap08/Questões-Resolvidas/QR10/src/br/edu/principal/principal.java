package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double s;
		System.out.println("Digite um número inteiro e positivo: ");
		num = sc.nextInt();
		s = sequencia(num);
		System.out.println("O valor de S obtido pelo cálculo foi: " + s);
		
		

	}
		public static double sequencia(int n) {
			int a, b;
			double f, seq;
			seq = 1;
			for (a = 1; a <= n; a++) {
				f = 1;
				for(b = 1; b <= a; b++) {
					f = f * b;
				}
			seq = seq + 1.0 / f;	
			}
			return seq;
		}

}
