
package galToLit;// 

import java.util.Scanner;

public class GalToLit {
	private static Scanner in;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
// declare as variáveis
		double gallons = 0;
		double liters = 3.785;				
// exiba o resultado para o usuário
		System.out.println(gallons + " gallons equals " + liters + " liters");
		System.out.println("Quantos Galões?");// usuario fazer pergunta?
		gallons = scanner.nextDouble();
		double gallonsequals = (gallons * liters);
		System.out.println(gallonsequals);
	}
}
