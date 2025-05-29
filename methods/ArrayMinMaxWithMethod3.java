package methods;

import java.util.Scanner;

public class ArrayMinMaxWithMethod3 {
	public static int min(int n, int array[]) {
		int min = array[0];
		for(int i=0; i<n; i++) {
			if(array[i] < min) {
				min = array[i];
			} 
		}
		return min;
	}
	public static void max(int n, int array[]) {
		int max = array[0];
		for(int i=0; i<n; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max= "+max);
	}
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
		
		System.out.println("Min= "+min(n,array));
		max(n,array);
		
		sc.close();
	}
}
/*Input=  
Size of array?
5
Enter values in array
76
98
52
63
12
Output= 
Array is: 76 98 52 63 12 
Min= 12
Max= 98
*/