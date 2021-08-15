package exercices;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int number = scanner.nextInt();
		
		for(int index = 0; index <= 10; index++)
			System.out.println(index + " x " + number + " = " + (index * number));
		
		scanner.close();
	}
}
