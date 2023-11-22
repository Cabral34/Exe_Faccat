package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Me informe o Custo de fabrica do seu carro");
		float fab = sc.nextFloat(); 
		float distr = (fab*28)/100;
		float impos = (fab*45)/100;
		float tot = (fab+distr+impos);
		System.out.println("O valor final do seu carro é de: "+String.format("%.2f", tot) );
	}  

}
