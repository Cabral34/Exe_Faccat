package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int Valor1=sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int Valor2=sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int Valor3=sc.nextInt();
		
		int soma1=Valor1+Valor2;
		int soma2=Valor2+Valor3;
		int soma3=Valor1+Valor3;
		if(Valor1>Valor2 && Valor2>Valor3) 
		{
			System.out.println("A soma dos 2 maiores valores digitados é de: "+soma1);
		}
		else if(Valor2>Valor1 && Valor3>Valor1) 
		{
			System.out.println("A soma dos 2 maiores valores digitados é de: "+soma2);
		}
		else if(Valor3>Valor1 && Valor1>Valor2) {
			System.out.println("A soma dos 2 maiores valores digitados é de: "+soma3);
		}
		else {
			System.out.println("A soma dos 2 maiores valores digitados é de: ");
		}
		
		sc.close();

	}

}
