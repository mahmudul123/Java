import java.util.Scanner;

public class Vote_In_NY {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print ("Enter your age: ");
		int age =scan.nextInt();
		
		if(age>=18) {
			System.out.println("You can vote in NY");
		}
		else System.out.println("Can't Vote");

	}

}
