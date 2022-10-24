package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * 
     * Calculates the amount earned after 3 months 
     * if the loaner payed evry month 10% of the amount owed.
     * @param the full amount owned (int)
     * @return the amount owned after 3 months (int)
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int month1,month2,month3,newAmount;
		month1 = (int)(amount*0.1);
		newAmount = amount - month1;
		month2 = (int)(newAmount*0.1);
		newAmount-=month2;
		month3 =(int)(newAmount*0.1);
		newAmount-=month3;
        return newAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
