package study;

public class Loops {
	public static void main(String[] args) {
		int indexWhile = 0;
		
		while(indexWhile < 10) System.out.println(indexWhile++);
		
		System.out.println("---------------");

		int indexDoWhile = 0;
		
		do {
			System.out.println(indexDoWhile++);
		} while(indexDoWhile < 5);
		
		System.out.println("---------------");
		
		for(int indexFor = 0; indexFor < 20; indexFor++) System.out.println(indexFor); 
	}
}
