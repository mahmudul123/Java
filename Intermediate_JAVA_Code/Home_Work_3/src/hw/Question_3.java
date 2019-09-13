/**
 * 
 */
package hw;

/**
 * @author mahmudulalam
 *
 */
import java.util.Scanner;
public class Question_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Using switch concept find out a June from a year, 
		//number the months 1-12 
	
		Scanner month_num = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the number of the month betweeen 1-12: ");
	    String number = month_num.nextLine();
	    System.out.println("The number is:"+ number);
	    
	    int result = Integer.parseInt(number);			
		
	    
	    switch(result) {
	    
	    case 1:{
	    	System.out.println("January");
	    	break;
	    }
	    case 2:{
	    	System.out.println("Febubary");
	    	break;
	    }
	    case 3:{
	    	System.out.println("March");
	    	break;
	    }
	    case 4:{
	    	System.out.println("April");
	    	break;
	    }
	    case 5:{
	    	System.out.println("May");
	    	break;
	    }
	    case 6:{
	    	System.out.println("June");
	    	break;
	    }
	    case 7:{
	    	System.out.println("July");
	    	break;
	    }
	    case 8:{
	    	System.out.println("August");
	    	break;
	    	
	    }
	    case 9:{
	    	System.out.println("September");
	    	break;
	    }
	    case 10:{
	    	System.out.println("Octobar");
	    	break;
	    }
	    case 11:{
	    	System.out.println("November");
	    	break;
	    }
	    case 12:{
	    	System.out.println("December");
	    	break;
	    }
	    default :{
			System.out.println("Not a valid input");
			break;
		}
	    }
	}

}
