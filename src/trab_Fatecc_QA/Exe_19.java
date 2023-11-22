package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("me informe um numero");
		int n1 = sc.nextInt();
		System.out.println("Me informe o segundo numero");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println("O numero "+n1+"é maior que o "+n2);
			
		}else if (n2>n1) {
			System.out.println("O numero "+n2+"é maior que o "+n1);
		}else {
			System.out.println("os numeros são iguais");
		}

	}

}
