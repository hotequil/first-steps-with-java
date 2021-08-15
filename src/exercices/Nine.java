package exercices;

import java.util.Scanner;

public class Nine{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		
		System.out.print("Informe um inteiro maior que 0: ");
		int number = scanner.nextInt();
		
		if(number < 1) System.out.println("O número deve ser maior que 0");
		else {
			for(int index = 1; index <= number; index++)			
				sum += (double) 1 / index;
		
			System.out.println("Total de " + sum);
		}
		
		scanner.close();
	}

}
