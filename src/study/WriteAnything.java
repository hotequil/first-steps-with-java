package study;

import java.util.Scanner;

public class WriteAnything {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int value;
		
		System.out.print("Digite seu nome: ");
		name = scanner.nextLine();
		
		System.out.print("Informe um inteiro: ");
		value = scanner.nextInt();
		
		switch(value) {
			case 1:
				System.out.println(name + ", você digitou o inteiro 1");
				break;
			default:
				System.out.println(name + ", você não digitou o inteiro 1, mas sim o " + value);
		}
		
		scanner.close();
	}
}
