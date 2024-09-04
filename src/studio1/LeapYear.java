package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		boolean leapYear;
		leapYear=((n%4==0)&&(n%100!=0)||(n%400==0));
		System.out.println(n+" is a leap year : "+leapYear);
	}

}
