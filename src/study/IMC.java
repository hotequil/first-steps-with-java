package study;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double weight, height, imc;
		
		System.out.print("Informe seu peso: ");
		weight = scanner.nextDouble();
		
		System.out.print("Informe sua altura: ");
		height = scanner.nextDouble();
		
		imc = weight / (height * height);
		
		System.out.println("Seu IMC é: " + imc);
	}
}
