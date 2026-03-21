package DSA.Sorting;

import java.util.Arrays;

// This class implements a solution to the Max Product of Three problem,
// which is a common coding challenge that asks for the maximum product 
// of any three numbers in a given array of integers. The solution sorts 
// the array and then calculates the product of the three largest numbers 
// and the product of the two smallest numbers (which could be negative) 
// multiplied by the largest number, and returns the maximum of these two products.
// This can be useful in sreal projects like:
// 1. Financial Analysis: In scenarios where you need to analyze the potential
//    returns of investments, you might want to find the maximum product of
//    three different financial indicators or stock prices to identify the best    
//    combination for maximizing returns.
// 2. Data Science and Machine Learning: When working with datasets, you might 
//    want to find the maximum product of three features or variables to identify 
//    strong interactions or relationships between them, which can be useful for 
//    feature engineering or model building.
// 3. Algorithmic Challenges: In competitive programming or coding interviews, 
//    this problem is a common test of your ability to manipulate arrays and 
//    understand the properties of numbers, especially when dealing with negative 
//    values and their impact on the product.

public class MaxProductOfThree {
    public int solution(int[] A) {
        // Implement your solution here
        // Get the length of the input array A and store it in a variable n for later use in accessing elements of the array
        int n = A.length;
        
        // Sort the input array A in ascending order to facilitate the calculation of the maximum product of three numbers
        Arrays.sort(A);

        // Calculate the product of the three largest numbers in the sorted array, which are located at the last three indices (n-1, n-2, n-3)
        int product1 = A[n - 1] * A[n - 2] * A[n - 3];

        // Calculate the product of the two smallest numbers (which could be negative) and the largest number
        int product2 = A[0] * A[1] * A[n - 1];

        // Return the maximum of the two products calculated above, which represents the maximum product of any three numbers in the input array
        return Math.max(product1, product2);
    }
}
