package study;

public class LogicalOperators {
	public static void main(String[] args){
		int firstNumber = 10;
		int secondNumber = 20;
		int aleatoryNumber = 50;
		
		System.out.println(aleatoryNumber == firstNumber);
		System.out.println(aleatoryNumber != secondNumber);
		System.out.println(firstNumber > secondNumber);
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		System.out.println(false ^ false);
		System.out.println(false ^ true);
		System.out.println(!false);
		System.out.println(!!false);
	}
}
