package HW;

public class Question_4 {

	public static void main(String[] args) {
		// Create a method with an integer return 
		// type & also pass two integer parameters 
		// and call in the main method & multiply 200 with the return value 
		 int s  = value(20,40);
		 int total=s*200;
		 System.out.println(total);

	}
	
	private static int value(int x, int y) {
		int total=x+y;
		return total;
		
	}

}
