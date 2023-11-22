package trab_Fatecc_QA;
import java.util.Scanner;

public class Exe_30 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor Digite um valor: ");
		int valor1=sc.nextInt();
		
		System.out.println("Por favor Digite um valor diferente do anterior: ");
		int valor2=sc.nextInt();
		
		System.out.println("Por favor Digite mais um valor diferente de todos os outros: ");
		int valor3=sc.nextInt();
		
		if(valor1< valor2 && valor2< valor3) 
		{
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor1+", "+valor2+", "+valor3);
		}
		else if(valor1 < valor3 && valor3 < valor2)
	    {
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor1+", "+valor3+", "+valor2);
	    }
		else if(valor2< valor1 && valor1< valor3) 
		{
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor2+", "+valor1+", "+valor3);
		}
		else if(valor2< valor3 && valor3<valor1) 
		{
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor2+", "+valor3+", "+valor1);
		}
		else if(valor3< valor1 && valor1< valor2) 
		{
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor3+", "+valor1+", "+valor2);
		}
		else 
		{
			System.out.println("A ordem crescente dos numeros Digitados é de: "+valor3+", "+valor2+", "+valor1);
		}
		sc.close();
	}
}
