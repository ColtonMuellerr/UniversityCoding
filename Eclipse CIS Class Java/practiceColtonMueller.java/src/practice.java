
import javax.swing.JOptionPane;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		
		String workdays;
		int days;
		int[] trans=null;
	    int cost = 0; 
		
	        String message = "How many days have you worked for this week?";
	        workdays = JOptionPane.showInputDialog(message);
	        days = Integer.parseInt(workdays);
	        trans = new int[days];
		
		
		switch (days) {
		
		case 1 : cost=300; break;
		case 2 : cost=500; break;
		case 3 : cost=600; break;
		case 4 : cost=650; break;
		case 5 : cost=700; 
		}
		
		int input;
		int transSum=0;
		Scanner sc = new Scanner(System.in);
		
		for (int counter : trans) {
			System.out.println("Enter the number of transactions:");
			input = sc.nextInt();
			transSum +=input;
			
			System.out.println(transSum);
			}
		
		int income; 
		income = transSum*50;
		int bonus=0;
		
		if (transSum>50) {
			bonus= 1000;
		}else if (transSum>=30 && transSum<=49) {
			bonus= 800;
		}else if (transSum>=10 && transSum<=29) {
			bonus= 500;
		}
		
		int revenue; 
		revenue = bonus + income - cost;
		JOptionPane.showMessageDialog(null, "Weekly revenue is $"+revenue);
		
			
		
		
		

	}

}
