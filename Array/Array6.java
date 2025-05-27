package corejava;
import java.util.Scanner;

public class Array6 {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];
		
		//array[0] = 12;
		//array[1] = 34;
		//array[2] = 56;
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<array.length ; i++) {
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	}
}
//Input=  90 34 71
//Output= 90 34 71 