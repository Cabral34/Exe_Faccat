package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe os eu sexo por favor\n");
		System.out.println("M = masculino\nF = Femea");
			String sx = sc.nextLine();
	    System.out.println("Agora me diga o seu peso");
	     	double ps = sc.nextDouble();
		System.out.println("E por ultimo me informe a sua altura");
			double alt = sc.nextDouble();
		System.out.println("peso:"+String.format("%.2f", ps)+"KG"+"\nAltura:"+alt+"\nSexo: "+sx);
		//o codigo String.format("%.2f", ps) foi utilizado para formatar em duas casas decimais apos a virgula
		if(sx.toLowerCase().equals("m")) {//EQUAL UTILIZADO PARA COMPARA A STRING DO SX	
			double altid= (72.7 * alt) - 58;
			System.out.println("O seu peso ideal seria: "+String.format("%.2f", altid));
		}else if(sx.toLowerCase().equals("f")) {
			double altid= (62.1* alt) -44.7;
			System.out.println("O seu peso ideal seria: "+String.format("%.2f", altid));
		}else {
			System.out.println("Sexualidade invalida!!"); 
		}
		
		
		

	}

}
