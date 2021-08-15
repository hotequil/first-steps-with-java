package exercices;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int biggerNumber = 0;
		int smallerNumber = 0;
		
		System.out.println("Você terá que informar 10 números");
		
		for(int index = 1; index <= 10; index++) {
			System.out.print(index + ") Coloque um número: ");
			int number = scanner.nextInt();
			
			if(index == 0){
				biggerNumber = number;
				smallerNumber = number;
			} else {
				if(number > biggerNumber) biggerNumber = number;
				if(number < smallerNumber) smallerNumber = number;
			}
		}
		
		System.out.println("Maior número: " + biggerNumber);
		System.out.println("Menor número: " + smallerNumber);
		
		scanner.close();
	}
}
