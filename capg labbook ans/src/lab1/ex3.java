package lab1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("using non recursive function: "+nr_fibonacci(n));
		System.out.println("using rescursive: "+r_fibonacci(n));
	}

	private static int r_fibonacci(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)
		       return n;
		    return r_fibonacci(n-1) + r_fibonacci(n-2);
	}

	private static int nr_fibonacci(int n) {
		// TODO Auto-generated method stub
		int a=1,b=1,c=0;
		//System.out.println(a);
		//System.out.println(b);
		for(int i=2;i<n;i++) {
			c=a+b;
			//System.out.println(c);
			a=b;
			b=c;
		}
		return c;
	}

}
