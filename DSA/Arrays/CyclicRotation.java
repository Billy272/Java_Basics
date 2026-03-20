package DSA.Arrays;

// This is used in scenarios where you have an array and you want to 
// rotate its elements to the right by a certain number of positions.
// For example, if you have an array representing a queue of people 
// and you want to rotate the queue to the right by K positions, 
// you can use this algorithm to efficiently perform the rotation 
// without needing to create multiple temporary arrays or perform multiple shifts.
// This can be useful in various applications such as scheduling,
// data manipulation, or any situation where you need to rearrange 
// elements in a cyclic manner.
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        // Get the length of the input array
        int N  = A.length;

        // If the input array is empty, return the empty array
        if (N == 0) return A;

        // Calculate the effective number of rotations needed by taking the modulus of K with N
        K = K % N;

        // Create a new array to store the rotated elements
        int[] result = new int[N];

        // Iterate through the input array and place each element in its new position in the result array
        for(int i = 0; i < N; i++) {
            // Calculate the new index for the current element
            int newIndex = (i + K) % N;
            // Place the current element in its new position in the result array
            result[newIndex] = A[i];
        }
        // Return the rotated array
        return result;
    }
}
