
import java.util.Scanner;

public class assignment9ColtonMueller {

	public static void main(String[] args) {
		
		int days, counter;
		double rate, fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the hotel daily rate");
		rate = sc.nextDouble();
		
		System.out.println("Please enter the number of days you stay");
		days = sc.nextInt();
		
		System.out.println("Days\tHotel fee");
		System.out.println("------------------");
		
		for (counter=1; counter<=days; counter++) {
			
			fee = rate * counter;
			System.out.printf(counter+"\t$%1.2f\n" ,fee);
			
			
			
			
		
		}
	}

}
