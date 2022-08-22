package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int reg=sc.nextInt();
			int mark=sc.nextInt();
			map.put(reg, mark);
		}
		System.out.println(getStudents(map));
	}

	private static Map getStudents(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<>();
		for(int x:map.keySet()) {
			if(map.get(x)>=90) {
				map1.put(x,"gold");
			}
			else if(map.get(x)>=80 && map.get(x)<90) {
				map1.put(x, "silver");
			}
			else if(map.get(x)>=70 && map.get(x)<80) {
				map1.put(x, "bronze");
			}
		}
		return map1;
	}

}
