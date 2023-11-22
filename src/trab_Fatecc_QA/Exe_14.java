package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_14 {
public static void main(String [] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Me informe um numero e direi se ele é maior que 10 ");
	int n1 = sc.nextInt();
	if(n1>10) {
		System.out.println("ELE É MAIOR QUE 10!!");
	}else if(n1==10){
		System.out.println("Seu numero é 10. Brinca direito");
	}else{
		System.out.println("Infelizmente o seu numero é abaixo de 10");	
  }
 }
}
