import java.text.DecimalFormat;

public class wk3methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Hello";
		int n = 3;
		System.out.println(multiplyString(word, n));
		System.out.println("-----");
		String firstName = "Michael";
		String lastName = "Jordan";
		System.out.println(fullName(firstName, lastName));
		System.out.println("-----");
		int [] numbersArray = {12, 37, 23, 22, 3, 25};
		boolean sumOver = sumGrThanArray(numbersArray);
		System.out.println(sumOver);
		System.out.println("-----");
		double [] doubleArray = {3.14, 5.21, 6.28, 7.37, 9.44};
		double ave = averageArray(doubleArray);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(ave));
		System.out.println("-----");
		double [] firstArray = {2.22, 3.69, 4.11, 5.20, 8.42};
		double [] secondArray = {1.67, 2.82, 4.19, 4.80, 8.88};
		boolean isGreater = isGrTh(firstArray, secondArray);
		System.out.println(isGreater);
		System.out.println("-----");
		boolean isHotOutside = true;
		double moneyInPocket = 12.75;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(buyDrink);
	
	}	
		
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
		
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	
	public static boolean sumGrThanArray(int [] numbers) {
		int sum=0;
		boolean sumOver = true;
		for (int number : numbers) {
			sum += number;
			sumOver = sum >100;
		}
		return sumOver;
	}
	
	
	public static double averageArray(double [] numbers) {
		double sum = 0.00;
		double ave = 0.00;
		for (double number : numbers) {
			sum += number;
			ave = sum/numbers.length;
		}
		return ave;
	}
	
	
	public static boolean isGrTh(double [] firstArray, double [] secondArray) {
		return averageArray(firstArray) > averageArray(secondArray);
	}
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket ) {
		boolean buyDrink = isHotOutside && (moneyInPocket > 10.5);
		return buyDrink;
	}
	
	
	
	
}
