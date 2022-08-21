package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		sc.close();
		sortStrings(arr);
	}

	private static void sortStrings(String[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		if(arr.length%2==0) {
			for(int i=0;i<arr.length;i++) {
				if(i<(arr.length/2)) {
					arr[i]=arr[i].toUpperCase();
				}
				else {
					arr[i]=arr[i].toLowerCase();
				}
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(i<(arr.length/2)+1) {
					arr[i]=arr[i].toUpperCase();
				}
				else {
					arr[i]=arr[i].toLowerCase();
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
