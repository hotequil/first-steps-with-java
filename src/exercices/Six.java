package exercices;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Six {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Digite um binário: ");
		String binary = scanner.next();
		String[] binaryList = binary.split("");
		
		Collections.reverse(Arrays.asList(binaryList));

		for(int index = 0; index < binary.length(); index++) {
			int part = Integer.parseInt(binaryList[index]);
						
			number += part * (Math.pow(2, index));
		}
		
		System.out.println("O número em decimal é: " + number);
	}
}
