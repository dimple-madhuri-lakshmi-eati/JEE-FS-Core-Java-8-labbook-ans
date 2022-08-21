package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			map.put(a,b);
		}
		ArrayList<Integer> list=new ArrayList<Integer>(map.values());
		System.out.println(list);
	}

}
