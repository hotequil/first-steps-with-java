package exercices;

import java.util.Scanner;

public class TeacherPay {
	public static void main(String[] args) {
		showPay();
	}
	
	private static double calculate(int level, double hours) {
		double result = 0;
		
		switch(level) {
			case 1:
				result = 21.50 * hours;
				break;
			case 2:
				result = 24.20 * hours;
				break;
			case 3:
				result = 30 * hours;
				break;
		}
		
		return result;
	}
	
	private static void showPay() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque seu nível [1/2/3]: ");
		int level = scanner.nextInt();

		System.out.print("Quantas horas trabalhou essa semana: ");
		double hours = scanner.nextDouble();
		
		System.out.print("Você receberá nessa semana: " + calculate(level, hours));
		
		scanner.close();
	}
}
