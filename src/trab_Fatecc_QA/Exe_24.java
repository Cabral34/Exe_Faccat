package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("me informe o seu salario fixo: ");
		double salf = sc.nextDouble();
		System.out.println("agora me infome o valor total de suas vendas: ");
		double vlr_ven = sc.nextDouble(); 
		double c1 = (vlr_ven*3)/100;
		
		if(vlr_ven>1500) {
			double extra = ((vlr_ven-1500)*5)/100;
			double tot = salf+extra;
			System.out.println("Com o extra de "+String.format("%.2f", extra)+"R$ "+"\n o seu salario ficou"+String.format("%.2f", tot)+"R$");
		}else {
			double tot = salf+c1;
			System.out.println("Seu salario ficou "+String.format("%.2f", tot)+"R$");
		}

	}

}
