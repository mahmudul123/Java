/**
 * 
 */
package Hw2;

/**
 * @author mahmudulalam
 *
 */
public class Question_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6.Print "more" & "than" from String 
		//"Nothing is more effective than sincere" using split concept
		String sen="Nothing is more effective than sincere";
		String[] n=sen.split(" ");
		System.out.println(n[2]+" & "+n[4]);
	}

}
