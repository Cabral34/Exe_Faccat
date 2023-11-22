package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_26 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o numero atual de produtos em estoque: ");
		double Estoq=sc.nextDouble();
		
		System.out.println("Digite o numero maximo de estoque desse produto: ");
		double EstoqMA=sc.nextDouble();
		
		System.out.println("Digite o numero minimo de estoque desse produto: ");
		double EstoqMI=sc.nextDouble();
		
		double Media=(EstoqMA+EstoqMI)/2;
		if (Estoq>=Media) 
		{
			System.out.println("Não efetuar compra!");
		}
		else 
		{
			System.out.println("Efetuar compra!");
		}
		sc.close();
	}

}
