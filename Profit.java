package mentorAssessment;

import java.util.Scanner;

public class Profit {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the price on day " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
        }

        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }
}
