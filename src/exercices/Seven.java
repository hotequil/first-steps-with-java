package exercices;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número primo: ");
		int number = scanner.nextInt();
		
		if(isPrimeNumber(number)) System.out.println("É número primo");
		else System.out.println("Não é número primo");
	}
	
	private static boolean isPrimeNumber(int number) {
		if(number < 2) return false;
		
		int dividers = 0;
		
		for(int index = 1; index <= number; index++) {
			if((number % index) == 0) dividers++;
		}

		return dividers == 2;
	}
}
