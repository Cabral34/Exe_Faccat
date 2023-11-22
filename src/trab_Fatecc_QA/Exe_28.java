package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor Digitar Valores Diferentes\n");
		
		System.out.println("Digite o primeiro valor: ");
		int Valor1=sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int Valor2=sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int Valor3=sc.nextInt();
		
		if(Valor1>Valor2 && Valor1>Valor3) 
		{
			System.out.println("O primeiro valor é o maior numero digitado!");
		}
		else if(Valor2>Valor1 && Valor2>Valor3) 
		{
			System.out.println("O segundo valor é o maior numero digitado!");
		}
		else 
		{
			System.out.println("O terceiro valor é o maior numero digitado!");
		}
		sc.close();

	}

}
