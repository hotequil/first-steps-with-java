package exercices;

import java.util.Scanner;

public class Eleven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, factorial = 1;
		double total = 0;

		System.out.print("Coloque um número: ");
		number = scanner.nextInt();
		
		if(number < 1) System.out.println("O número deve ser maior que zero");
	    else{
			for(int index = 1; index <= number; index++){
				factorial *= index;
				total += (double) index / factorial;
			}
			
			System.out.println("Total: " + total);
		}
		
		scanner.close();
	}
}
