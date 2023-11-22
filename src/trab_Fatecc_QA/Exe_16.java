package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_16 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Me informe o numero de maças por favor");
			int mc = sc.nextInt(); 
			if(mc<12) {
				double tot = 1.30*mc;
				System.out.println("Já que você só comprou "+mc+" o valor fica "+tot+ "R$");
			}else {
				int tot = 1*mc;
				System.out.println("Já que você comprou "+mc+" o valor fica "+tot+ "R$");
			}
	}

}
