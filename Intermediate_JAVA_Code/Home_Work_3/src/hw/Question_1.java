/**
 * 
 */
package hw;

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
		//Using if-else concept buy an item which is priced $100 and 
		//less than $200 between 4 stores & make sure the third store has the item.
		
		int store1=190;
		int store2=40;
		int store3=100;
		int store4=250;
		
		int my_money=199;
		int my_money2=100;
		
		if(my_money>=store1) {
			System.out.println("Store one is an option. priced 190.");
		}
		else System.out.println("Store one is not a good choice");
		
		if (my_money>=store2) {
			System.out.println("Store two is an option. priced 40.");
		}
		else System.out.println("Store two is not a good choice");
		
		if (my_money>=store3) {
			System.out.println("Store three is an option. priced 100.");
		}
		else System.out.println("Store three is not a good choice");
		
		if (my_money>=store4) {
			System.out.println("Store four is an option. priced 250.");
		} 
		else System.out.println("Store four is not a good choice.");
		
		// If we want to print only the third store. 
		
		if(my_money2==store1) {
			System.out.println("Store one is an option. priced 190.");
		}
		else if (my_money2==store2) {
			System.out.println("Store three is an option. priced 100.");
		}
		else if (my_money2==store3) {
			System.out.println("Store three is an option. priced 100.");
		}
		else if(my_money2==store4) {
			System.out.println("Store three is an option. priced 100.");
		}
		else System.out.println("Do not have enough money to buy from any of the store.");
		

	}

}
