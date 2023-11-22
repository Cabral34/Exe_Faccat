package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me infome quantos graus Fahrenheit faz na sua cidade: ");
		double far = sc.nextDouble();
		double cels = (far-32)/1.8; 
		System.out.println("Esse valor é equivalente a "+cels+ "°C ");
	}

}
