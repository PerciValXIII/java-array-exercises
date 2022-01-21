package assignment;

import java.util.Scanner;

public class sortArray {
	
	
	public static void bubbleSort(int a[]) {
		int n = a.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		
		int n = 10;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		bubbleSort(arr);
		System.out.print("Print Sorted Array -> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}

	}

}
