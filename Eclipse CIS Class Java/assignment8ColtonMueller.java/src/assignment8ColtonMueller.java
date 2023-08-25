
import java.util.Scanner;

public class assignment8ColtonMueller {

	public static void main(String[] args) {
		
		int days, counter;
		double wage, fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your wage per a day");
		wage = sc.nextDouble();
		
		System.out.println("Please enter the number of days you have worked");
		days = sc.nextInt();
		
		System.out.println("Days\tSalary");
		System.out.println("---------------------");
		
		for (counter=1; counter<=days; counter++) {
			
			fee = wage * counter;
			System.out.printf(counter+"\t$%1.2f\n" ,fee);
			
			
			
			
		
		}
		
	}

}
