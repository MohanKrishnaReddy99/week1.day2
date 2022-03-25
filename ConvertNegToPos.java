package week1.day2;


public class ConvertNegToPos {

	public static void main(String[] args) {
		int number = -40;
		if (number<0) {
			
			number = (number+-2*number);
		} 
		System.out.println("The number -40 is converted to 40");

	}

}