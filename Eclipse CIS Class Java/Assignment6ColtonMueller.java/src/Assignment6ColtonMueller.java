
import java.util.Scanner;

public class Assignment6ColtonMueller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double rate = 0;
		
		System.out.print("Please enter the square feet");
		double feet = sc.nextDouble();
		
		if (feet <= 1000)
			rate = 10;
		else if (feet >1000 && feet <2000)
			rate = 15;
		else if (feet >2000 && feet <3000)
			rate = 17;
		else if (feet > 3000)
			rate = 20;
		
		int discount;
		
		System.out.print("Please enter your membership code: 1 for gold, 2 for silver, and 3 for bronze, and 4 for standard");
		discount = sc.nextInt();
		
		
		switch (discount) {
		
		case 1 : discount = 300; break;
		case 2 : discount = 200; break;
		case 3 : discount = 100; break;
		case 4 : discount = 0;
		
		}
		
		double charge;
		charge = (rate * feet - discount);
		System.out.printf("The painting charges is $%,15.2f\n",charge);
		
		
		
		
		
		
		
		

	}

}
