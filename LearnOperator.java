package week1.day2;
public class LearnOperator {
	

	public static void main(String[] args) {
		
		int num = 15;
		
		if (num%3==0 && num%5==0) {
			System.out.println("TANPAN");
		} 
		
		else if (num%5==0) {
			System.out.println("PAN");
		}
		else if (num%3==0) {
			System.out.println("TAN");
		}
	}
}