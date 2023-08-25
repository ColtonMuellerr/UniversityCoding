
import java.util.Scanner; 

public class Assignment5ColtonMueller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rate = 0;
		
		System.out.print("Please enter the weight of a package");
		double weight = sc.nextDouble();
		//System.out.println(+ weight);
		
		
		if (weight <= 2)
			rate = 1; 
		if (weight > 2)
			rate = 2;
		
		
		System.out.print("Please enter miles shipped");
		double mile = sc.nextDouble();
		//System.out.println(+ mile);
		
		int discount;
		
		System.out.print("Please enter your membership code: 11 for gold, 22 for silver and 33 for standard");
		discount = sc.nextInt();
		
		
		switch (discount) {
		
		case 11 : discount = 20; break;
		case 22 : discount = 10; break;
		case 33 : discount = 0; 
		
		}
		
		double shipping;
		shipping = (rate * mile - discount);
		System.out.println("The shipping charges is "+ shipping);
		
		
		
		
		

	}

}
