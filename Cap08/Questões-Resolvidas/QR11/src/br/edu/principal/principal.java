package br.edu.principal;
import java.util.Scanner;
public class principal {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sexo = new String[5];
        String[] olhos = new String[5];
        String[] cabelos = new String[5];
        int[] idade = new int[5];
        int m, i, q;

        leitura(sc, sexo, olhos, cabelos, idade);

        m = media_idade(olhos, cabelos, idade);
        System.out.println("Média de idade: " + m);

        i = maior_idade(idade);
        System.out.println("Maior idade: " + i);

        q = qt_individuos(sexo, olhos, cabelos, idade);
        System.out.println("Quantidade de indivíduos: " + q);

        
    }

    public static void leitura(Scanner sc, String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        for (int x = 0; x < 5; x++) {
            do {
                System.out.println("Informe o sexo (F/M) da pessoa " + (x + 1) + ": ");
                sexo[x] = sc.nextLine().toUpperCase();
            } while (!(sexo[x].equals("F") || sexo[x].equals("M")));

            do {
                System.out.println("Informe a cor dos olhos (C/A) da pessoa " + (x + 1) + ": ");
                olhos[x] = sc.nextLine().toUpperCase();
            } while (!(olhos[x].equals("C") || olhos[x].equals("A")));

            do {
                System.out.println("Informe a cor do cabelo (C/L/P) da pessoa " + (x + 1) + ": ");
                cabelos[x] = sc.nextLine().toUpperCase();
            } while (!(cabelos[x].equals("C") || cabelos[x].equals("L") || cabelos[x].equals("P")));

            System.out.println("Informe a idade da pessoa " + (x + 1) + ": ");
            idade[x] = sc.nextInt();
            sc.nextLine(); 
        }
    }

    public static int media_idade(String[] olhos, String[] cabelos, int[] idade) {
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
           
                soma += idade[i];
                cont++;
            }
        

        if (cont == 0) {
            return 0;
        } else {
            return soma / cont;
        }
    }

    public static int maior_idade(int[] idade) {
        int maior = idade[0];

        for (int i = 1; i < 5; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }

        return maior;
    }

    public static int qt_individuos(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        int qtd = 0;

        for (int i = 0; i < 5; i++) {
            if (sexo[i].equals("F") && idade[i] >= 18 && idade[i] <= 35 && olhos[i].equals("A") && cabelos[i].equals("L")) {
                qtd++;
            }
        }

        return qtd;
    }
}
