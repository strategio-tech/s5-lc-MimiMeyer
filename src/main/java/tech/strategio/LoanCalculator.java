package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * 
     * Calculates the amount earned after 3 months 
     * if the loaner payed every month 10% of the amount owed.
     * @param  amount the amount owned (int)
     * @return newAmount the amount owned after 3 months (int)
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int month,newAmount;
	newAmount = amount;
	for (int i= 0; i<3; i++)
	{
		month = (int)(newAmount*0.1);
		newAmount = newAmount - month;
	}
        return newAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
