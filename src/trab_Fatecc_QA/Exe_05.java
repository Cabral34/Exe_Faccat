package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		System.out.println("Me diga um numero");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("O Antessesor do numero em questão é "+(num-1));
				
	}

}