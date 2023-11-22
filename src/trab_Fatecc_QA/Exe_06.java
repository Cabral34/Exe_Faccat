package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_06 {

	public static void main(String[] args) {
			System.out.println("Me diga a base do seu Triangulo");
			Scanner sc = new Scanner(System.in);
			int bas = sc.nextInt();
			System.out.println("Agora me informe a altura dele ");
			int alt = sc.nextInt();
			int tot = alt*bas/2;
			System.out.println("A Area do seu Trianulo é :"+tot );
					
		}

	}


