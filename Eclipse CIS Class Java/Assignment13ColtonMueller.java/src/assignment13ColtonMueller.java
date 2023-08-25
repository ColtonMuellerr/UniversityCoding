import javax.swing.JOptionPane;

public class assignment13ColtonMueller {

	public static void main(String[] args) {
		
		String number1;

		int intNumber1;

		number1= JOptionPane.showInputDialog("How many foods do you want to order?");
		intNumber1 = Integer.parseInt(number1);
		System.out.println(number1);
		
		int sum;
		sum = intNumber1*15;
		
		System.out.println("The total of amount:"+sum); 
		
		
		
		
	}

}
