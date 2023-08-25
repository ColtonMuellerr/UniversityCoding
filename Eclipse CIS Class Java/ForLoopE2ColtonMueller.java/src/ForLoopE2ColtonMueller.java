
import java.util.Scanner;

public class ForLoopE2ColtonMueller {

	public static void main(String[] args) {
		
		int num, counter;
		double feet, fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your house square feet");
		feet = sc.nextDouble();
		
		System.out.println("How many cleaning services do you want?");
		num = sc.nextInt();
		
		System.out.println("The number of service\tFee");
		System.out.println("-------------------------------");
		
		for (counter=1; counter<=num; counter++) {
			
			fee = counter * feet;
			System.out.printf(counter+"\t\t\t$%1.2f\n" ,fee);
			
		}
	}

}
