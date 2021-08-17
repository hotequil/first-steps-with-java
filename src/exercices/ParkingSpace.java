package exercices;

import java.util.Scanner;

public class ParkingSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		int spaces = 10;
		
		for(int index = 0; index < spaces; index++) {
			System.out.print((index + 1) + ") Informe o número da vaga: ");
			int number = scanner.nextInt();
			
			if(number % 2 == 0) even++;
			else odd++;
		}
		
		System.out.println("Vagas pares: " + even);
		System.out.println("Vagas ímpares: " + odd);
		
		scanner.close();
	}
}
