package gpt_class;

public class MaxProfit {

    int[] prices = {7, 1, 5, 3, 6, 4};

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                System.out.println("Min Price: "+ minPrice);
            }

            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                System.out.println("Max Profit: "+ maxProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit obj = new MaxProfit();
        System.out.println("Profit made: "+ obj.maxProfit(obj.prices));
    }
}