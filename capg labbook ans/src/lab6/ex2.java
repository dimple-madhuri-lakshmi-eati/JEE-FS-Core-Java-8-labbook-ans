package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		System.out.println(countChars(arr));
	}

	private static Map<Character,Integer> countChars(char[] arr) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char ch:arr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		return map;
	}

}
