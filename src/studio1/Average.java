package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("The first of two integers to be averaged?");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		double average = (((double)n1 + (double)n2)/2);
		
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");

	}

}
