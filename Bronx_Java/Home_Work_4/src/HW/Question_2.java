/**
 * 
 */
package HW;

/**
 * @author mahmudulalam
 *
 */
public class Question_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a class with one static method and  
		//two non-static methods and call them in the main method 
		
		Question_2 ar=new Question_2();
		first();
		ar.second();
		ar.third();
		
		
	}
	//First Void Static Method.
	public static void first() {
		System.out.println("This is the first Static Method.");
	}
	
	//Non-Static Methods
	
	public void second() {
		System.out.println("First Non-Static Method.");
	}
	
	public void third () {
		System.out.println("Second Non-Static Method.");
	}
	

}
