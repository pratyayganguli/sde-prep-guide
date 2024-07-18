package problemsolving.extras.arrays;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 *
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 *
 * approach:
 *
 * computing the max profit: buy at the lowest and then sell at the highest.
 * Thus, profit will be the highest price - lowest price.
 *
 * solving the question in O(n)
 */

class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        double maxProfit = getMaxProfit();
        System.out.println(maxProfit);
    }

    public static double getMaxProfit() {
        // prices in dollars
        double [] stockPriceForWeek = new double[] {
                300.3345, 788.2661, 200.9127, 500.2124, 921.7283
        };

        double lowestPrice = findLow(stockPriceForWeek);
        double highestPrice = findPeak(stockPriceForWeek);

        return highestPrice - lowestPrice;
    }

    // finding the peak price the stock has reached.
    private static double findPeak(double [] stockPrices) {
        double maxValue = stockPrices[0];
        for (int i = 0; i < stockPrices.length; i++) {
            if(stockPrices[i] > maxValue) {
                maxValue = stockPrices[i];
            }
        }
        return maxValue;
    }

    // finding the lowest price the stock has reached.
    private static double findLow(double [] stockPrices) {
        double minValue = stockPrices[0];
        for (int i = 0; i < stockPrices.length; i++) {
            if(stockPrices[i] < minValue) {
                minValue = stockPrices[i];
            }
        }
        return minValue;
    }
}
