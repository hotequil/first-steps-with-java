package exercices;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado: ");
		double firstSide = scanner.nextDouble();
		
		System.out.print("Informe o segundo lado: ");
		double secondSide = scanner.nextDouble();
		
		System.out.print("Informe o terceiro lado: ");
		double thirdSide = scanner.nextDouble();
		
		if(isTriangle(firstSide, secondSide, thirdSide)) {
			System.out.println("É um triângulo, e do tipo: " + getTrianguleTypeName(firstSide, secondSide, thirdSide));
		} else System.out.println("Não é um triângulo");
		
		scanner.close();
	}
	
	private static boolean isTriangle(double firstSide, double secondSide, double thirdSide) {
		return (firstSide + secondSide) > thirdSide || (firstSide + thirdSide) > secondSide;
	}
	
	private static String getTrianguleTypeName(double firstSide, double secondSide, double thirdSide){
		if(firstSide == secondSide && firstSide == thirdSide) return "Equilátero";
		else if(firstSide != secondSide && firstSide != thirdSide && secondSide != thirdSide) return "Escaleno";
		else if(
			(firstSide == secondSide && firstSide != thirdSide) ||
			(firstSide != secondSide && firstSide == thirdSide) || 
			(thirdSide == secondSide && thirdSide != firstSide) ||
			(thirdSide != secondSide && thirdSide == firstSide)
		) return "Isósceles";
		
		return "Desconhecido";
	}
}
