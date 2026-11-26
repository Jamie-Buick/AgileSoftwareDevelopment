package ie.atu.dip;

import java.util.Scanner;

public class SumOfClass {

	private Scanner userInputScanner;
	
	
	public SumOfClass() {
		userInputScanner = new Scanner(System.in);	
	}
	
	
	//prompt the user for two values
	public int getFirstInput() {

		System.out.println("Please enter a number: ");
		String userInput = userInputScanner.next();
			
				
		return Integer.parseInt(userInput);
	}
	
	public int getSecondInput() {

		System.out.println("Please enter a number: ");
		String userInput = userInputScanner.next();
			
				
		return Integer.parseInt(userInput);		
		
	}
	
	
	// perform the actual sum
	public static int sumInt(int val1, int val2) {
		
		return val1 + val2;
	}
	
	
	
public static void main(String[] args) {
		
	SumOfClass calculator = new SumOfClass();		
	
		int val1 = calculator.getFirstInput();
		int val2 = calculator.getSecondInput();
	
		int sum = sumInt(val1, val2);
	 
		System.out.println("Answer is: " + sum);
	
	}
	

}
