
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Birthday {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		BigDecimal numerator = new BigDecimal("1");
		BigDecimal denominator = new BigDecimal("1");
		BigDecimal denom = new BigDecimal("365");
		BigDecimal num = new BigDecimal("365");
		BigDecimal extra = new BigDecimal("1");
		BigDecimal extra2 = new BigDecimal("1");

		double probabilityDash, probability;
		int i, n = 30;			//30 students

		/* Calculate Numerator and Denominator */

		for (i=1; i<n; i++) {
			numerator = numerator.multiply(num);
			denominator = denominator.multiply(denom);

			num = num.subtract(extra);
			System.out.println(numerator);
		}
		extra = numerator;

		/* Calculate ProbabiltyDash = Numerator/Denominator */

		extra2 = (extra.divide(denominator, 10, RoundingMode.HALF_EVEN));
		probabilityDash = extra2.doubleValue();
		/* Probability = 1 - ProbabilityDash */

		probability = (double)1 - probabilityDash;

		System.out.println("\n\n\nProbability of Two Students out of 30 having the same Birthday \n\n\t\t\t\t= " + probability + "\n\n");


	}
}