package exercices;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueAsking = true;
		
		while(continueAsking) {
			calculator(scanner);
			
			System.out.print("Você quer que seja exibida mais uma tabuada? [s/n] ");
			String answer = scanner.next();
					
			if(answer.equals("n")) continueAsking = false;
		}
		
		System.out.println("Tchauuuuuuuuuu");
		
		scanner.close();
	}
	
	public static void calculator(Scanner scanner){
		System.out.print("Informe um número: ");
		int number = scanner.nextInt();
		
		for(int index = 0; index <= 10; index++) 
			System.out.println(index + " x " + number + " = " + (index * number));
	}
}
