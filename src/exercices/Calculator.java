package exercices;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		ask();
	}
	
	private static void spacePrint() {
		System.out.println("");
	}
	
	private static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	private static double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	private static double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	private static double division(double firstNumber, double secondNumber) {
		if(firstNumber == 0 || secondNumber == 0) return 0;

		return firstNumber / secondNumber;
	}
	
	private static void ask() {
		Scanner scanner = new Scanner(System.in);
		
		double result = 0;
		boolean hasResult = true;
		
		System.out.println("Calculadora");
		
		spacePrint();
		
		System.out.print("Informe o primeiro número: ");
		double firstNumber = scanner.nextDouble();
		
		spacePrint();
		
		System.out.print("Informe o segundo número: ");
		double secondNumber = scanner.nextDouble();
		
		spacePrint();
		
		System.out.println("As operações são:");
		System.out.println("1 - Adição;");
		System.out.println("2 - Subtração;");
		System.out.println("3 - Multiplicação;");
		System.out.println("4 - Divisão.");
		
		spacePrint();
		
		System.out.print("Informe a operação desejada: ");
		int operation = scanner.nextInt();

		switch(operation) {
			case 1:
				result = sum(firstNumber, secondNumber);
				break;
			case 2:
				result = subtraction(firstNumber, secondNumber);
				break;
			case 3:
				result = multiplication(firstNumber, secondNumber);
				break;
			case 4:
				result = division(firstNumber, secondNumber);
				break;
			default:
				hasResult = false;
		}
		
		spacePrint();
		
		if(hasResult) System.out.print("O resultado é: " + result);
		else System.out.print("Ocorreu algum erro de digitação no processo");
	}
}
