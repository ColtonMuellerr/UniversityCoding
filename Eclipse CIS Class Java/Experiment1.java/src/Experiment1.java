import java.util.Scanner;

import javax.swing.JOptionPane;

public class Experiment1 {

	public static void main(String[] args) {

		 int[] arNumber = null;
	        int number;
	        String str;

	      

	        String message = "How many grades will you input in this class?";
	        str = JOptionPane.showInputDialog(message);
	        number = Integer.parseInt(str);
	        arNumber = new int[number];
		
	}

}
