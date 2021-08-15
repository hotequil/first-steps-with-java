package exercices;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o primeiro número: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Coloque o segundo número: ");
		int secondNumber = scanner.nextInt();
		
		if(firstNumber >= secondNumber) System.out.println("O segundo número deve ser maior que o primeiro");
		else{
			int index = firstNumber + 1;
			int sum = 0;
			
			while(index < secondNumber) {
				if((index % 2) == 1) sum += index;
				
				index++;
			}
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
