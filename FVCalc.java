// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		Double precentageRate = Double.parseDouble(args[1]);
		int numberOfYears = Integer.parseInt(args[2]);

		Double fractionRate = precentageRate / 100;
		double futureValue = currentValue * (Math.pow(1 + fractionRate, numberOfYears));

		System.out.println("After " + numberOfYears + " years, " + currentValue +
						   "$ saved at " + precentageRate + "% will yield " +
						   (int) futureValue + "$");
	}
}