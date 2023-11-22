package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_33 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1= sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2= sc.nextInt();
		
		if(valor1>valor2) 
		{
			System.out.println("O primeiro valor é maior que o segundo!");
		}
		else 
		{
			System.out.println("O segundo valor é maior que o primeiro!");
		}
		sc.close();

	}

}
