package DSA.Sorting;

import java.util.Arrays;

// This class implements a solution to the Triangle problem, which is a 
// common coding challenge that asks for the existence of a triangular 
// triplet in a given array of integers. A triangular triplet is defined 
// as three numbers that can form the sides of a triangle, which means that 
// the sum of any two sides must be greater than the third side. The 
// solution sorts the array and then checks for any three consecutive 
// elements to see if they satisfy the triangle condition. If such a triplet 
// is found, the function returns 1; otherwise, it returns 0 after checking 
// all possible triplets. This can be useful in various applications 
// such as geometry, computer graphics, or any situation where you 
// need to determine if a set of lengths can form a valid triangle.
public class Triangle {
    public int solution(int[] A) {
        // Implement your solution here
        // Calculate the length of the input array
        int N = A.length;

        // If the length of the array is less than 3, it's not 
        // possible to form a triangle, so we return 0 immediately  
        if ( N < 3) {
            return 0;
        }

        // Sort the input array in ascending order to facilitate the 
        // checking of the triangle condition for any three consecutive elements
        Arrays.sort(A);

        // Iterate through the sorted array and check for any three consecutive
        for (int i = 0; i < N - 2; i++) {
            // Check if the sum of the two smaller sides (A[i] and A[i + 1]) 
            // is greater than the largest side (A[i + 2]), which is the triangle condition. If this condition is satisfied, it means we have found a valid triangular triplet, so we return 1 to indicate that a triangle can be formed with these three sides.
            if ((long) A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }

        // If we finish iterating through the array and do not find any three 
        // consecutive elements that satisfy the triangle condition, we return 0 
        // to indicate that no triangle can be formed with any three sides 
        // from the input array.
        return 0;
    }
}
