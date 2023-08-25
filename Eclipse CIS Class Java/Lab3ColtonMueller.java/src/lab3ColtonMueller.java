import java.util.Scanner;
import static java.lang.System.out;

public class lab3ColtonMueller {
	

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
			
			System.out.print("Please enter a test score ");
				int score3 = sc.nextInt();
				System.out.println(+ score3);
				
			double test1;
			test1 = (score + score1 + score2 + score3)/4;
			System.out.print("Your exam score average: " + test1);
		
		
		
	}
}
