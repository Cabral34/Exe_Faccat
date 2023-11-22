package trab_Fatecc_QA;
import java.util.Scanner;

public class Exe_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe a sua data de nascimento, por favor ");
		int id = sc.nextInt();
		int vot = 2023-id;
		if(vot<=17) {
			System.out.println("Devido a sua idade de "+vot+", Você não está apto para votar");
			
		}else {
			System.out.println("Com a idade de "+vot+" Você está apto a votar");
		}
	}

}
