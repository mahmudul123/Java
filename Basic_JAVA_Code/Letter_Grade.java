import java.util.Scanner;
public class Letter_Grade {

	public static void main(String[] args) {
		//Write a program that takes a numeric input from keyboard and 
		//computes a letter grade based on the value entered.
		
		Scanner scan =new Scanner(System.in);
		System.out.print ("Enter your grade: ");
	
		int score =scan.nextInt();
		
		char LetterGrade=' ';
		
		if(score>=80) {
			LetterGrade='A';

		}
		else if(score>=70) {
			LetterGrade='B';
		}
		else if (score>=60) {
			LetterGrade='D';
		}
		else {
			if(score<=0) {
				System.out.println("It is a negative number, please enter a posative number.");
			}

		}
		
		System.out.println(LetterGrade);
	}

}
