import java.util.Scanner;

public class NY_DrinkAndDrive {

	public static void main(String[] args) {
		// They can drink 21 or more
		//18 + driving 
		//16 or 17 you can have a junior lisence 
		// write a program that will say what the user can do based on the age. 
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print ("Enter your age: ");
		int age =scan.nextInt();
		
		if(age>=18 && age<21) {
			System.out.println("You can have lisence but you can not drink or smoke");
		}
		else if (age<16 && age>0) {
			System.out.println("You can not drink neither you can have the driving lisence");
		}
		else if (age>=21) {
			System.out.println("You can drink, smoke and ayou can have the driving lisence");
		}
		else if(age==16 || age ==17 ) {
			System.out.println("You can only have the junior driving lisence but you can not drink");
			
		}
		else System.out.println("Invalid age");
			

	}

}
