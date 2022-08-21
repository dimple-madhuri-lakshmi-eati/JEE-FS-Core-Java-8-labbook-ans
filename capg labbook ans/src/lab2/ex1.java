package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		getSecondSmallest(arr);
	}

	private static void getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
