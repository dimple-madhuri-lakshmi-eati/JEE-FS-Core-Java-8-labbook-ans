package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getSquares(arr));
	}

	private static Map<Integer,Integer> getSquares(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int x:arr) {
			map.put(x, x*x);
		}
		return map;
	}

}
