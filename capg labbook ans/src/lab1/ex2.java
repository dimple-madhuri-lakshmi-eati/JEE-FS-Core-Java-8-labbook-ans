package lab1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("choose from the options below:");
		System.out.println("red"+"\n"+"yellow"+"\n"+"green");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals("red")) {
			System.out.println("stop");
		}
		else if(str.equals("yellow")) {
			System.out.println("ready");
		}
		else if(str.equals("green")) {
			System.out.println("Go");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
