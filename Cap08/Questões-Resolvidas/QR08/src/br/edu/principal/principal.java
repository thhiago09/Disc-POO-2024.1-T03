package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, minutos;
		System.out.println("Digite a hora e os minutos de início: ");
		hora_i = sc.nextInt();
		min_i = sc.nextInt();
		System.out.println("Digite a horae os minutos de término: ");
		hora_f = sc.nextInt();
		min_f = sc.nextInt();
		minutos = calculo(hora_i, min_i, hora_f, min_f);
		System.out.println("O total de minutos foi: " + minutos + " minutos." );
	}
		public static int calculo(int h_i, int m_i, int h_f, int m_f) {
			int tot_h, tot_m, total;
			if (m_f  < m_i) {
				m_f = m_f + 60;
				h_f = h_f - 1;
			}
			if (h_f < h_i) {
				h_f = h_f + 24;
			}
			tot_m = m_f - m_i;
			tot_h = h_f - h_i;
			total = tot_h * 60 + tot_m;
			return total;
		}

}
