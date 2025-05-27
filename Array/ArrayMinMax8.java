package corejava;
import java.util.Scanner;

public class ArrayMinMax8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of array?");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		System.out.println("Enter values in array");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int min = array[0];
		int max = array[0];
		
		for(int i=0; i<n; i++) {
			if(array[i] < min) {
				min = array[i];
			} 
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Min= "+min+" Max= "+max);
		sc.close();
	}
}
