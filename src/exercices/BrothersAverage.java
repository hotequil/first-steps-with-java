package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class BrothersAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int months = 12;
		int brothers = 3;
		int[][] list = new int[brothers][months];
		int[] savings = new int[brothers];
		
		for(int brotherIndex = 0; brotherIndex < brothers; brotherIndex++) {
			for(int monthIndex = 0; monthIndex < months; monthIndex++) {
				System.out.print("Quanto o irmão " + (brotherIndex + 1) + " poupou no mês " + (monthIndex + 1) + ": ");
				savings[brotherIndex] += scanner.nextInt();
			}	
		}
		
		System.out.println("savings: " + Arrays.toString(savings));
		
		scanner.close();
	}
}
