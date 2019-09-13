import java.util.Scanner;
public class Using_Switch {

	public static void main(String[] args) {
		
		//To import anything from the keyboard/User input
		Scanner scan =new Scanner(System.in);
		System.out.print ("Enter your grade: ");
		int score =scan.nextInt();

		switch(score) {
		
		case 5:
			System.out.println("A");
			break;
		case 4:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 2:
			System.out.println("D");
			break;
			
		//When two of the cases has the same output we can put them together without using a break.
		case 1:
		case 0:
			System.out.println("F");
			break;
			
		//An output that will always print with the execution of the program. 
		default:
			System.out.println("Invalid Score Entred");

		}
		
		
	}

}
