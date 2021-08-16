package exercices;

import java.util.Scanner;

public class GroupAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int minimum = 6;
		int[] students = new int[10];
		int average = 0;
		int sum = 0;
		
		for(int index = 0; index < students.length; index++) {
			System.out.print("Informe a nota do aluno número " + (index + 1) + ": ");
			students[index] = scanner.nextInt();
			sum += students[index];
		}
				
		average = sum / students.length;
		
		if(average >= minimum) System.out.print("Parabéns turma: " + average);
		else System.out.print("Média ruim turma: " + average); 
			
		scanner.close();
	}
}	
