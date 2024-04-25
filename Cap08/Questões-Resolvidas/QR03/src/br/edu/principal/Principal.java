package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a, b, c, result;
		
        do {
            System.out.println("Digite um número maior que 1:");
            a = sc.nextInt();
        } while (a <= 1);

        System.out.println("Digite dois números (b e c):");
        b = sc.nextInt();
        c = sc.nextInt();

        result = divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);

	sc.close();
	}
	
	public static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            int r = i % a;
            if (r == 0) {
                s += i;
            }
        }
        return s;
    }

}
