package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe quantas horas foram trabalhadas nesse mes");
		int hrs = sc.nextInt();
		System.out.println("Agora me informe quanto você recebe por hora");
		int vlrhr = sc.nextInt(); 
		int sal = hrs*vlrhr;
		int n1 = hrs/4;
		if(n1>40) {
			int sal2 = sal+(sal/2); 
			
			System.out.println("Devido as suas horas extras o salario nesse mes ficaria "+sal2+"R$ ");
			
		}else {
			System.out.println("O seu salario esse mes ficou  "+sal);
		}
		
	}
}
