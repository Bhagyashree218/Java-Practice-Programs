package corejava;
import java.util.Scanner;
public class SwitchCalculator4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 50, b = 10;
		String ans;
		
		do {
			System.out.println("Choose 1.Add 2.Sub 3.Mul 4.Div");
			String ch = sc.nextLine();
			switch(ch) {
			case "1" : System.out.println(a+b);
					break;
			case "2" : System.out.println(a-b);
				break;
			case "3" : System.out.println(a*b);
				break;
			case "4" : System.out.println(a/b);
				break;
			}
			System.out.println("Want to continue? Press y");
			ans = sc.nextLine();
		}while(ans.equals("y"));
		
		sc.close();
	}
}
