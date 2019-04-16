/**
 * 
 */
package HW;

/**
 * @author mahmudulalam
 *
 */
import java.util.Scanner;
public class Question_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a method with a String return 
		// type & call in the main method
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("This sentence you want to find the reapting letter is  ");
	    String sentence = user_input.nextLine();
	    
		
		name(sentence);
		
	}
	
	public static String name(String x) {
		System.out.println(x);
		return x;
		
	}

}
