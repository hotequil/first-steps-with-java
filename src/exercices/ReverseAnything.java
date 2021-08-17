package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnything {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantity = 10;
		int[] list = new int[quantity];
		int[] reversedList = new int[quantity];
		
		for(int index = 1; index <= quantity; index++) {
			System.out.print(index + ") Informe um número para a lista: ");
			int number = scanner.nextInt();
			
			list[index - 1] = number;
			reversedList[quantity  - index] = number;
		}
		
		System.out.println("list: " + Arrays.toString(list));
		System.out.println("reversedList: " + Arrays.toString(reversedList));
		
		scanner.close();
	}
}
