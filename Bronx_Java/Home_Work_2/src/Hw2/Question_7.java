/**
 * 
 */
package Hw2;

/**
 * @author mahmudulalam
 *
 */
public class Question_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7. Declare Strings "Hello "," TTech  ","  Students     "  
		//print by removing all empty spaces from strings
		String name="Hello ";
		String is=" TTech   ";
		String rony="  Students     ";
		String name1=name.substring(0, 5);
		String is1=is.substring(1, 6);
		String rony1=rony.substring(2, 10);
		
		System.out.println(name1+is1+rony1);
		
		// Trim operator will only remove the spaces before and after the words not from the middle of the sentence.
		System.out.println(name.trim()+" "+is.trim()+" "+rony.trim());
		
		
	}

}
