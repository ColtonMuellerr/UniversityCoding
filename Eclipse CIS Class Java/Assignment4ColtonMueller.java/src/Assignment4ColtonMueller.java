
import java.util.Scanner;

public class Assignment4ColtonMueller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer");
		int number = sc.nextInt();
		System.out.println(+ number);
		
		if (number > 40)
			System.out.println("It is greater than 40");
		if (number < 20)
			System.out.println("It is less than 20");
		if (number > 20 && number < 40)
			System.out.println("It is greater than 20 and less than 40"); 
		if (number == 20)
			System.out.println("It is 20");
		if (number == 40)
			System.out.println("It is 40");
		

	}

}
