package lab3;

import java.time.LocalDate;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		getMonthDayYear(str);

	}

	private static void getMonthDayYear(String str) {
		// TODO Auto-generated method stub
		LocalDate curr=LocalDate.parse(str);
		System.out.println("Day: "+curr.getDayOfMonth());
		System.out.println("Month: "+curr.getMonth());
		System.out.println("Year: "+curr.getYear());
	}

}
