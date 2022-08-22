package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int ID=sc.nextInt();
			int age=sc.nextInt();
			map.put(ID,age);
		}
		System.out.println(votersList(map));

	}

	private static List votersList(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for(int x:map.keySet()) {
			if(map.get(x)>18) {
				list.add(x);
			}
		}
		return list;
	}

}
