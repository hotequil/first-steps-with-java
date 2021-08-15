package exercices;

import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Preço do produto: ");
		double price = scanner.nextDouble();

		if(price > 1000) discount(price, 15);
		else discount(price, 8);
		
		scanner.close();
	}
	
	private static void discount(double price, int percentage){
		double discount = (price * percentage) / 100;
		
		System.out.println("Total sem desconto: " + price);
		System.out.println("Total com desconto: " + (price - discount));
		System.out.println("Total economizado: " + discount);
	}
}
