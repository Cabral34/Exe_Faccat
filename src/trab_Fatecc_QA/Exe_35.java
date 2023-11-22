package trab_Fatecc_QA;
import java.util.Scanner;
public class Exe_35 {
	public class CalculoCombustivel {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Informe o número de litros vendidos:");
	        double litros = sc.nextDouble();

	        System.out.println("Informe o tipo de combustível (A para álcool, G para gasolina):");
	        char tipoCombustivel = sc.next().charAt(0);

	        double precoAlcool = 2.90;
	        double precoGasolina = 3.30;
	        double desconto = 0;

	        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
	            if (litros <= 20) {
	                desconto = 0.03;
	            } else {
	                desconto = 0.05;
	            }
	        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
	            if (litros <= 20) {
	                desconto = 0.04;
	            } else {
	                desconto = 0.06;
	            }
	        } else {
	            System.out.println("Tipo de combustível inválido. Use A para álcool ou G para gasolina.");
	            sc.close();
	            return;
	        }

	        double precoPorLitro = (tipoCombustivel == 'A' || tipoCombustivel == 'a') ? precoAlcool : precoGasolina;
	        double valorAPagar = litros * (precoPorLitro - (precoPorLitro * desconto));

	        System.out.println("Valor a ser pago pelo cliente: R$ " + valorAPagar);

	        sc.close();
	    }
	}
}
