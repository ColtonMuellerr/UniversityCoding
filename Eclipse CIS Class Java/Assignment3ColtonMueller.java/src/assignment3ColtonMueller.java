
import java.util.Scanner;

public class assignment3ColtonMueller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Please enter a test score ");
			int score = sc.nextInt();
			System.out.println(+ score);
			System.out.print("Please enter a test score ");
			int score1 = sc.nextInt();
			System.out.println(+ score1);
			
			 System.out.print("Please enter a test score ");
				int score2 = sc.nextInt();
				System.out.println(+ score2);
				
				double test1;
				test1 = (score + score1 + score2)/3;
				System.out.print("Your test score average: " + test1);
		

	}

}
