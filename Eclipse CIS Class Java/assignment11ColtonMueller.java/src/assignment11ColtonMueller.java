
public class assignment11ColtonMueller {

	public static void main(String[] args) {
		
		int[] intarray = {50,75,35,80,27,45,65,87,38};
		int sum=0;
		
		for (int i=0; i<intarray.length; i++) {
			sum+=intarray[i];
			
			}
			System.out.println("Sum is "+ sum);
			
			int avg;
			avg= sum/intarray.length;
			
			System.out.println("Average is "+avg);
		
			//tried multiple ways to get 56 through rounding and remainders but could not figure it out.Might be making it too complicated. 

	}

}
