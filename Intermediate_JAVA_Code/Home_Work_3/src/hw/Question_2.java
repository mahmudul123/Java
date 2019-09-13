/**
 * 
 */
package hw;

/**
 * @author mahmudulalam
 *
 */
public class Question_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Using switch concept find out a Wednesday 
		//from a week, number the days 1-7 
		

		int day=3;
		
		switch(day){
		
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}
		case 3:{
			System.out.println("Wednesday");
			break;
		}
		case 4:{
			System.out.println("Thursday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:{
			System.out.println("Saturday");
			break;
		}
		case 7:{
			System.out.println("Sunday");
			break;
		}
		default :{
			System.out.println("Not a valid input");
			break;
		}
		

		
		}

	}

}
