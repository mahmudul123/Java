/**
 * 
 */
package HW;

/**
 * @author mahmudulalam
 *
 */
public class Question_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare 10 string variables using one 
		//dimension array concept and print them in separate lines
		
			
			numbers();
			sentence();
		
			
		}
		
		public static void sentence() {
			String[] list= {"My", "name" ,"is" ,"mahmudul" ,"alam", "rony,", "i", "am", "from", "bangladesh." };
			for (int i=0; i<=list.length;i++) {
				System.out.println(list[i]);
			}
			
		}
		public static void numbers() {
			int number[]= {1,2,3,4,5,6,7,8,9,};
			
			for (int i=0;i<number.length;i++) {
				System.out.println("Number is"+number[i]);
			}
		}
			

}
