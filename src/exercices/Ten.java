package exercices;

import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
		System.out.print("Digite um número: ");
		int number = scanner.nextInt();
		
		if(number < 1) System.out.println("O número tem que ser maior que 0");
		else{
			for(int index = 1; index <= number; index++) {
				double division = (double) 1 / index;
				
				if(index % 2 == 0) total -= division;
				else total += division;
			}
			
			System.out.println("Total: " + total);
		}
		
		scanner.close();
	}
}
