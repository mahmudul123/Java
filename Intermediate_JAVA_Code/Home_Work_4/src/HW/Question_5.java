/**
 * 
 */
package HW;

/**
 * @author mahmudulalam
 *
 */

import java.util.Scanner;
public class Question_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a method with an integer return type & also 
		//pass two integer parameters and call in the main method 
		//& multiply 200 with the return value
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
	    String number1= user_input.nextLine();
	    System.out.print("Enter the second number: ");
	    String number2= user_input.nextLine();
	    
	    
	    
		int result1 = Integer.parseInt(number1);
		int result2 = Integer.parseInt(number2);
	    
	    
	    
		Question_5 ar=new Question_5();
		int value=ar.rony(result1, result2);
		System.out.println("Two entred number has been added then multiplyed by 200. This final number is: "+(value*200));
		
		
	}
	
	
	public  int rony(int x,int y) {
		int add=x+y;
		return add;
	}

}
