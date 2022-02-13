package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraImc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Qual o seu peso ?");
		double peso = sc.nextDouble();
		System.out.println("Qual a sua altura ?");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println("Seu imc é :" + formatador.format(imc));

		if (imc <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade grau 1 ");
		} else if (imc < 40) {
			System.out.println("Obesidade grau 2 (severa) ");
		} else {
			System.out.println("Obesidade grau 3 (mórmida) ");
		}
	}
}
