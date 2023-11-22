package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("me informe o salario atual do usuario e o reajuste necessario \n");
		System.out.println("Salario: ");
		double sal = sc.nextInt();
		System.out.println("Porcentual de reajuste: ");
		double vlrp = sc.nextInt();
		double porc = (vlrp/100) * sal;
		System.out.println("O salario atual do usuario seria de : "+(porc+sal));
		
		//System.out.println(porc );
	}

}
