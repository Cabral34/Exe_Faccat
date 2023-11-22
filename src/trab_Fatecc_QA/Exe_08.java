package trab_Fatecc_QA;

import java.util.Scanner;

public class Exe_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o total de eleitores do municipio: ");
        double totmun=sc.nextDouble();

        System.out.println("Digite o valor total de votos brancos: ");
        double votbrancos=sc.nextDouble();

        System.out.println("Digite o valor total de votos nulos: ");
        double votnulos=sc.nextDouble();

        System.out.println("Digite o valor total de votos válidos: ");
        double votvalidos=sc.nextDouble();

        votbrancos=(votbrancos/totmun)*100;
        votnulos=(votnulos/totmun)*100;
        votvalidos=(votvalidos/totmun)*100;

        double porcbranco= votbrancos;
        double porcnulos=   votnulos;
        double porcvalidos= votvalidos;

        System.out.println("O total de votods brancos é de: "+porcbranco+" %");
        System.out.println("O total de votos nulos é de: "+porcnulos+" %");
        System.out.println("O total de votos válidos é de: "+porcvalidos+" %");
		 
		
		

	}

}
