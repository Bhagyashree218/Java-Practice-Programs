package methods;

import java.util.Scanner;

class students2{
	int id;
	String name;
}
public class Students1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		students2 s1 = new students2();
		
		System.out.println("Student id?");
		s1.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Student name?");
		s1.name = sc.nextLine();
		
		System.out.println("Student id:"+s1.id +" Student name:"+s1.name);
	}
}

