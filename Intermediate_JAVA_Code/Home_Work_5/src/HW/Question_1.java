package HW;

public class Question_1 {

	public static void main(String[] args) {
		// 1.Create three public, private and 
		// protected methods and call them different 
		// class and package class respectively
		first();
		second();
		third();

	}
	
	public static void first() {
		String x="It will print anywhere in file across packages";
		System.out.println(x);
	}
	
	private static void second() {
		String x="It will only print in on one class ";
		System.out.println(x);
	}
	
	protected static void third() {
		String x="It will print across different classes ";
		System.out.println(x);
	}

}
