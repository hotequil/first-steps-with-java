package study;

public class ConditionOperators {
	public static void main(String[] args){
		int firstNumber = 10;
		int secondNumber = 20;
		int aleatoryNumber = 50;
				
		if(firstNumber > secondNumber) System.out.println("firstNumber é maior que secondNumber");
		else if(firstNumber == secondNumber) System.out.println("firstNumber é igual a secondNumber");
		else System.out.println("firstNumber é menor que secondNumber");
		
		switch(aleatoryNumber){
			case 5:
				System.out.println("5 é igual");
				break;
			case 8:
				System.out.println("8 é igual");
				break;
			default:
				System.out.println("Nenhum é igual");
		}
	}
}
