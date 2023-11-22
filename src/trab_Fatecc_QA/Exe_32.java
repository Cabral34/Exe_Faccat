package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		String Time1=sc.next();
		
		System.out.println("Digite o nome do segundo time: ");
		String time2=sc.next();
		
		System.out.println("Digite o numero de gols do primeiro time: ");
		int gol1= sc.nextInt();
		
		System.out.println("Digite o numero de gols do segundo time: ");
		int gol2= sc.nextInt();
		
		int GolT=gol1+gol2;
		
		if(gol1>gol2) 
		{
			System.out.println("O vencedor da partida foi o: "+Time1);
			System.out.println("e o total de gols da partida é de: "+GolT);
		}
		else 
		{
			System.out.println("O vencedor da partida foi o: "+time2);
			System.out.println("e o total de gols da partida é de: "+GolT);
		}
		sc.close();

	}

}
