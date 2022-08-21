package lab1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum is "+calculateSum(n));

	}

	private static int calculateSum(int n) {
		int sum = 0;
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	

}
