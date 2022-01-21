package assignment;

import java.util.Scanner;

public class printArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		
		int n = 10;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.print("Print Array -> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}

	}

}
