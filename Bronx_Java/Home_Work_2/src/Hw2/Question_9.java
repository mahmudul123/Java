/**
 * 
 */
package Hw2;

/**
 * @author mahmudulalam
 *
 */
public class Question_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 9.Declare three integer variables and print true & false for below operators
	    //  1. > more than
//	        2. < less than
//	        3. == equal to
//	        4. && and
//	        5. |  | or  
//	        6. >= more than equal
//	        7. <=less than equal
		
		int one=20;
		int two=20;
		int three=30;
		
		System.out.println("For > more than");
		System.out.println(one>two);
		System.out.println(three>one);
	
		System.out.println("For < less than");
		System.out.println(one<two);
		System.out.println(two<three);
		
		System.out.println("For == equal to");
		System.out.println(one==two);
		System.out.println(two==three);
		
		System.out.println("For && and");
		System.out.println((one>two)&&(one<two));
		System.out.println((three>two)&&(one<three));
		
		System.out.println("For || or");
		System.out.println((one>two)||(one<two));
		System.out.println((three>two)||(one<three));
		
		
		System.out.println("For >= more than");
		System.out.println(one>=two);
		System.out.println(two>=three);
		
		System.out.println("For <= less than");
		System.out.println(one<=two);
		System.out.println(three<=two);
		
		
	}

}
