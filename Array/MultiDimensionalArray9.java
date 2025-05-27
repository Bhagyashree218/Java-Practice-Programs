package corejava;
import java.util.Scanner;
public class MultiDimensionalArray9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array?");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int array[][] = new int[a][b];
		
		System.out.println("Enter values in array");
		for(int i=0; i<array.length; i++) {					//i<a;
			for(int j=0; j<array[i].length; j++ ) {			//j<b;
				array[i][j] = sc.nextInt();				
			}
		}
		
		System.out.println("Your array is: ");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
