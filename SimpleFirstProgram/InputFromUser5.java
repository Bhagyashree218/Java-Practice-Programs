package corejava;
import java.util.Scanner;

public class InputFromUser5{
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		
		String name;
		int age;
		float marks;
		
		System.out.println("Student name?");
		name = sc.nextLine();
		
		System.out.println("Age?");
		age = sc.nextInt();
		
		System.out.println("Marks?");
		marks = sc.nextFloat();
		
		System.out.println("Name: "+name+"\nAge: "+age+"\nMarks: "+marks);
		
		sc.close();
	}
	
}