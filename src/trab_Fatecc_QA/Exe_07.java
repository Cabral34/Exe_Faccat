package trab_Fatecc_QA;
import java.util.Scanner;

public class Exe_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe a sua idade em anos meses e dias por favor\n");
		System.out.println("Ano: ");
		int anos = sc.nextInt();
		System.out.println("Meses: ");
		int mes = sc.nextInt();
		System.out.println("Dias");
		int dias = sc.nextInt();
		int tot = (anos*365) + (mes*30) + dias; 
		System.out.println("O total em dias seria:  "+ tot);
		
	}

}
