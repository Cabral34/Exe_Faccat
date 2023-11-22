package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int A= sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int B= sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int C= sc.nextInt();
		
		if(A< B + C && B< C+A && C<A+B) {
			System.out.println("Isso é Um Trinangulo!!!");
			
		}else {
			System.out.println("Vai se fuder");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(A<= B+C && B<=A+C ) 
		{
			System.out.println("Os numeros Digitados formam um triangulo!");
		}
		else if(C<=A+B && A<=B+C ) 
		{
			System.out.println("Os numeros Digitados formam um triangulo!");
		}
		else if(A>C+B && B>C+A) {
			System.out.println("Os numeros digitados não formam um triângulo!");
		}
		else if(C>A+B && A>B+C)
		{
			System.out.println("Os numeros digitados não formam um triângulo");
		}
		else {
			System.out.println("os numeros digitados não formam um triangulo");
		}
		sc.close();
		*/
	}

}
