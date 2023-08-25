package lab9ColtonMueller.java;

import java.util.Scanner;

public class Lab9ColtonMueller {

	public static void main(String[] args) {
		
		int hour, counter;
		double wage, fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your wage per hour");
		wage = sc.nextDouble();
		
		System.out.println("Please enter the numver of hours you have worked");
		hour = sc.nextInt();
		
		System.out.println("Hours\tLabor fee");
		System.out.println("------------------");
		
		for (counter=1; counter<=hour; counter++) {
			
			fee = wage * counter;
			System.out.printf(counter+"\t$%1.2f\n" ,fee);
			
			
			
			
		
		}

	}

}
