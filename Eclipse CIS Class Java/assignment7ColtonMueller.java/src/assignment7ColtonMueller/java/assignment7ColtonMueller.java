package assignment7ColtonMueller.java;

import java.util.Scanner;

public class assignment7ColtonMueller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter a positive nonzero integer.");
		int a= sc.nextInt();
		
		int i, num=a, sum=0;
		
		for (i=0; i <= num; i+=2) {
			sum = sum+i;
		}
		
			System.out.println("The sum of all the even numbers between 1 and "+ a +" is "+sum +".");
		
		
		
		

	}

}
