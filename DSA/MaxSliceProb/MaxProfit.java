package DSA.MaxSliceProb;

// This class implements a solution to the Max Profit problem, which is a 
// common coding challenge that asks for the maximum profit that can be 
// achieved from a single buy and sell of a stock given an array of stock 
// prices. The function iterates through the array of prices, keeping track 
// of the minimum price seen so far and calculating the potential profit if 
// the stock were sold at the current price. It updates the maximum profit 
// whenever a higher profit is found. This can be useful in scenarios such 
// as financial analysis, algorithmic trading, or any situation where you 
// need to optimize buying and selling decisions based on historical price 
// data.

// In real projects, this algorithm can be useful in scenarios such as:
// 1. Financial Analysis: To analyze historical stock price data and determine 
//    the best times to buy and sell stocks for maximum profit.
// 2. Algorithmic Trading: To develop trading algorithms that can make informed
//    decisions on when to buy and sell stocks based on price trends and historical data.
// 3. Investment Strategy: To help investors optimize their investment 
//    strategies by identifying the best opportunities for profit
//    based on past performance of stocks or other financial instruments.

public class MaxProfit {
    public int solution(int[] A) {
        // Implement your solution here
        // Handle empty or single day array
        if (A.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = A[0];

        for (int i = 1; i < A.length; i++) {
            // Update minimum price seen
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else {
                // Calculate potential profit if sold today
                int currentProfit = A[i] - minPrice;

                // Update global max profit if the current one is higher
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
