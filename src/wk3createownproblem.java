import java.text.DecimalFormat;

public class wk3createownproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wk3.13a - Take an array of scores on a physical performance measure of a team 
		//and find the average score on the performance measure for the team to report to the coach.
		
		int [] fmsScores = {14, 16, 20, 18, 13, 12, 8, 10, 15, 13, 11, 9, 6, 16, 15};
		int ave = fmsAverage(fmsScores);
		System.out.println("FMS average: " + ave);
		System.out.println("----");
		
		//wk3.13b - Find the Quarterback rating of any college quarterback from last season 
		//by using the NFL's QBR formula, then pass this information along to the GM of any team.
		
		double compPass = 300;
		double passAttempt = 450;
		double passYards = 3456;
		double tdPass = 32;
		double intercept = 8;
		double rating = qbRating(compPass, passAttempt, passYards, tdPass, intercept);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("QBR is below:");
		System.out.println(df.format(rating));
		
	}

	public static int fmsAverage(int [] scores) {
		int sum = 0;
		int ave =0;
		for (int score : scores) {
			sum += score;
			ave = sum / scores.length;
		}
		return ave;
	}
	
	public static double qbRating(double a, double b, double c, double d, double e) {
		double compRatio = 250/3 * ((a/b) - 0.3);
		double yardPerPass = 25/6 * ((c/b) - 3);
		double tdRatio = 1000/3 * (d/b);
		double intRatio = 1250/3 * (0.095 -(e/b));
		double rating = compRatio + yardPerPass + tdRatio + intRatio;
		return rating;
	}
	
	
}
