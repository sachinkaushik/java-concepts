package leetcodePatterns;

public class SlidingWindowBuySell {
    public static int maxProfit(int[] prices) {
        int left = 0;  // Buy day
        int right = 1; // Sell day
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                // Good profit opportunity
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Found a lower price to buy
                left = right;
            }
            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        SlidingWindowBuySell solution = new SlidingWindowBuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices)); // Output: 5
    }
}
