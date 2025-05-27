package corejava;
import java.util.Scanner;

public class ArrayInput7 {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of the array");
			int n = sc.nextInt();
			
			int array[] = new int[n];
			
			System.out.println("Enter values in the array");
			for(int i=0; i<n; i++) {
				array[i] = sc.nextInt();
			}
			
			System.out.print("Array is: ");
			for(int i =0; i<n; i++) {
				System.out.print(array[i]+ " ");
			}
			sc.close();
	}
}
