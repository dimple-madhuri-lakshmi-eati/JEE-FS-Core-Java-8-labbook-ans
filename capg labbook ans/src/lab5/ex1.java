package lab5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws Myexception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
			if(age>=15) {
				System.out.println("valid age");
			}
			else {
				throw new Myexception("age should be above 15");
			}

		
	}

}


