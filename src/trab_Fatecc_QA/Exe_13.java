package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("me informe o valor da sua primeira nota");
			float n1 = sc.nextFloat();
		System.out.println("me informe o valor da sua segunda nota");
			float n2 = sc.nextFloat();
		System.out.println("me informe o valor da sua terceira nota");
			float n3 = sc.nextFloat();
		double med1 = (n1*2)+(n2*3)+(n3*5); 
		double med2 = med1/10f;
		System.out.println("A media do aluno foi de :"+med2);
		
	}

}
