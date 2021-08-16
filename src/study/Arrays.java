package study;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] firstNumbers = {1, 2, 3, 4, 5, 6, 7};
		int quantity = 10;
		int[] secondNumbers = new int[quantity];
		int smallerIndex = 0;
		
		for(int index = 0; index < quantity; index++) {
			System.out.print((index + 1) + ") Coloque um número: ");
			secondNumbers[index] = scanner.nextInt();
			
			if(secondNumbers[index] < secondNumbers[smallerIndex]) 
				smallerIndex = index;
		}
		
		System.out.print("Menor: " + secondNumbers[smallerIndex]);
				
		scanner.close();
	}
}
