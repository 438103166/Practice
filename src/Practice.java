import java.util.Scanner;

public class Practice {
	
	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("enter your name:");
		String Name = scanner.nextLine();
		
		scanner = new Scanner(System.in);
		System.out.println("enter your ID:");
		int ID = scanner.nextInt();
		
		scanner = new Scanner(System.in);
		System.out.println("enter your major:");
		String major = scanner.nextLine();
		
		studentName(Name);
		System.out.println(ID);
		System.out.println(major);
	}
	public static void studentName(String name) {
		System.out.println(name);
	}
	public static int studentID(int ID){
		return ID;
	}
	public static String major(String major){
		return major;
	}
}