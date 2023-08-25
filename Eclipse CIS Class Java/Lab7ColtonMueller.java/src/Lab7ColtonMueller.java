
import java.util.Scanner; 

public class Lab7ColtonMueller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double rate = 0;
		
		System.out.print("Please enter the square feet");
		int feet = sc.nextInt();
		
		if (feet <= 1000)
			rate = 10.99;
		if (feet > 1000)
			rate = 15.99;
		
		double charge;
		charge = (feet * rate);
		
		System.out.printf("The painting charges is $%20.2f\n" ,charge);
		
			
		
		
		
		
		
		
		
		
		

	}

}
