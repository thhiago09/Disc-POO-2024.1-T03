package br.edu.principal;

public class SubRotina {

	public static double reajuste(double pa, double pn){
		double result = ((100*pn) - (100*pa))/pa;
		return result;
	}

}
