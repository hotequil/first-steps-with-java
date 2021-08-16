package study;

import java.util.Arrays;
import java.util.Scanner;

public class Lists {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] firstNumbers = {1, 2, 3, 4, 5, 6, 7};
		int[] secondNumbers = new int[10];
		int smallerIndex = 0;
		
		for(int index = 0; index < secondNumbers.length; index++) {
			System.out.print((index + 1) + ") Coloque um número: ");
			secondNumbers[index] = scanner.nextInt();
			
			if(secondNumbers[index] < secondNumbers[smallerIndex]) 
				smallerIndex = index;
		}
		
		System.out.print("Menor: " + secondNumbers[smallerIndex]);
				
		scanner.close();
	}
	
    public static void convertToString(int list[][]){ 
        for(int index = 0; index < list.length; index++){
        	System.out.println(Arrays.toString(list[index])); 
        } 
    } 
}
