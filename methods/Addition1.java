package methods;
import java.util.Scanner;
public class Addition1 {
	public static int add(int a, int b) {
		
		return a+b;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(add(a,b));
		
		sc.close();
	}
}
