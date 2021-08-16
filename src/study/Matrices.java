package study;

import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int firstQuantity = 10;
		int secondQuantity = 3;
		int[][] list = new int[firstQuantity][secondQuantity];
		
		for(int firstIndex = 0; firstIndex < firstQuantity; firstIndex++) {
			for(int secondIndex = 0; secondIndex < secondQuantity; secondIndex++) {
				System.out.print("(" + firstIndex + "|" + secondIndex + ") Coloque um número: ");
				list[firstIndex][secondIndex] = scanner.nextInt();
			}	
		}
		
        Lists.convertToString(list);
		
		scanner.close();
	}
}
