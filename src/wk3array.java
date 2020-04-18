import java.util.Arrays;

public class wk3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalLetters = 0;
		int averageLetters = 0;
		for (String name : names) {
			totalLetters += name.length ();
			averageLetters = totalLetters / (names.length + 1);
		}
		System.out.println("totalLetter = " + totalLetters);
		System.out.println("averageLetter = " + averageLetters);
		
		System.out.println("------");
		
		
		String all = "";
		for (int i = 0; i <names.length; i++) {
			all = all + (names[i] + " ");
			System.out.println(all);
		}
		System.out.println("------");
		
		
		int [] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i ++) {
			nameLengths[i] = names[i].length();
			System.out.println(Arrays.toString(nameLengths));
		}
		
		System.out.println("------");
		
		
		int sum = 0;
		for (int i = 0; i <nameLengths.length; i++) {
			sum += nameLengths[i];
			System.out.println("The sum of the array nameLengths is:" + sum);
		}
			
		
	
	}

}
