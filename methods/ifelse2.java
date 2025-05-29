package methods;
import java.util.Scanner;
public class ifelse2 {
	public static void greater(int a, int b ,int c) {
		if(a>b && a>c) {
			System.out.println(a + " is greater");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is greater");
		}
		else{
			System.out.println(c + " is greater");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		greater(a,b,c);
		sc.close();
	}
}
