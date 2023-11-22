package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe um numero por favor");
		int n1 = sc.nextInt(); 
		int cal = n1%2;
		if(cal==0) {
			System.out.println("SEU NUMERO É PAR!!!");
		}else {
			System.out.println("Seu numero é impar");
		}

	}

}
