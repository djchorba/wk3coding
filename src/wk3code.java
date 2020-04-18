
public class wk3code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 40};
		int firstAge = ages [0];
		int lastAge = ages[ages.length-1];
		int sum = 0;
		
		System.out.println(lastAge - firstAge);
		System.out.println("-----");
		
		
		for (int i = 0; i < ages.length; i++) {
			sum = sum + ages[i];
		}
			double average = sum / ages.length; 
			System.out.println(average);
	    
		
	}
}
