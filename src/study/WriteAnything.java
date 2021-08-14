package study;

import java.util.Scanner;

public class WriteAnything {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		
		System.out.print("Informe um inteiro:");
		value = scanner.nextInt();
		
		switch(value) {
			case 1:
				System.out.println("O inteiro é 1");
				break;
			default:
				System.out.println("O inteiro não é 1, mas é " + value);
		}
		
		scanner.close();
	}
}
