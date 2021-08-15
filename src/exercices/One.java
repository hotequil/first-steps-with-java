package exercices;

import java.util.Scanner;

public class One{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o primeiro número: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Coloque o segundo número: ");
		int secondNumber = scanner.nextInt();
		
		if(firstNumber >= secondNumber) System.out.print("O segundo número deve ser maior que o primeiro");
		else{
			for(int index = firstNumber + 1; index < secondNumber; index++) 
				System.out.println(index);
		}
		
		scanner.close();
	}
}
