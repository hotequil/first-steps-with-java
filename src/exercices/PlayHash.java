package exercices;

import java.util.Scanner;
import study.Lists;

public class PlayHash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] rowsAndColumns = new int[3][3];
		boolean win = false;
		
		System.out.println("Coloque 1 para X ou 0 para O");
		
		for(int row = 0; row < rowsAndColumns.length; row++){
			for(int column = 0; column < rowsAndColumns.length; column++){
				Lists.convertToString(rowsAndColumns);
				System.out.println("Linha: " + row);
				System.out.println("Coluna: " + column);
				System.out.println("1 (X) ou 0 (O): ");
				
				rowsAndColumns[row][column] = scanner.nextInt(); 
			}	
		}
		

		if(!win) win = winInRowOrColumn(true, rowsAndColumns);
		if(!win) win = winInRowOrColumn(false, rowsAndColumns);
	
		if(
			!win 
			&&
			(
				(
					rowsAndColumns[0][0] == rowsAndColumns[1][1] &&
					rowsAndColumns[0][0] == rowsAndColumns[2][2]
				)
				||
				(
					rowsAndColumns[0][2] == rowsAndColumns[1][1] &&
					rowsAndColumns[0][2] == rowsAndColumns[2][0]
				)
			)	
		) win = true;
		
		Lists.convertToString(rowsAndColumns);
		
		if(win) System.out.println("Alguém ganhou");
		else System.out.println("Ninguém ganhou");
			
		scanner.close();
	}
	
	private static boolean winInRowOrColumn(boolean firstPosition, int[][] list) {
		boolean win = false;
		int index = 0;
		
		while(!win && index < list.length) {		
			if(
				(
					firstPosition && 
					list[index][0] == list[index][1] &&
					list[index][0] == list[index][2]
				)
				||
				(
					list[0][index] == list[1][index] &&
					list[0][index] == list[2][index]
				)
			) win = true;
				
			index++;
		}
		
		return win;
	}
}
