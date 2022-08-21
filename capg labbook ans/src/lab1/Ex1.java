package lab1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cubes_of_digit(n));
	}

	private static double cubes_of_digit(int n) {
		// TODO Auto-generated method stub
		double sum=0.0;
		while(n>0) {
			sum=sum+(Math.pow((n%10), 3));
			n=n/10;
		}
		return sum;
	}

}
