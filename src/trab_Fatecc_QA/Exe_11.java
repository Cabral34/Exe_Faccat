package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor me passe algumas informaçoes referentes a esse mes\n");
		System.out.println("Quantos carros foram vendidos");
		double cv = sc.nextDouble();
		System.out.println("qual seria o valor total deles");
		double vt = sc.nextDouble();
		System.out.println("Valor de salario fixo");
		double sf = sc.nextDouble();
		System.out.println("E por ultimo, me informe o valor da sua comissão por carro ");
		double vcs = sc.nextDouble();
		double totc = cv * vcs;
		double sx =(5*vt)/100;
		double tot = sf + sx + totc;
		
		System.out.println("O seu salario final esse mes seria de "+tot);
		
				
		
		
		
		
	}

}
