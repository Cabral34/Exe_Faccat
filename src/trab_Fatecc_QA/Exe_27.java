package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor qualquer: ");
		int vlr=sc.nextInt();
		
		if(vlr>0) 
		{
			System.out.println("O valor digitado é positivo!");
		}
		else if (vlr<0)
		{
			System.out.println("O valor digitado é negativo!");
		}
		else 
		{
			System.out.println("O valor digitado é zero");
		}
		sc.close();

	}

}
