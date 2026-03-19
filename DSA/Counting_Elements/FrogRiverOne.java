package DSA.Counting_Elements;

// This class implements a solution to the Frog River One problem, 
// which is a common coding challenge that asks for the earliest time 
// when a frog can jump across a river given certain conditions. 
// The frog can only jump on positions where leaves have fallen, 
// and the goal is to determine the earliest time when all positions
//  from 1 to X are covered by leaves. If it's not possible for the 
// frog to jump across, the function returns -1.
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // Implement your solution here
        // Create a set to store the positions where leaves have fallen
        Set<Integer> positionsFound = new HashSet<>();

        // Iterate through the array A to find the earliest time when all positions from 1 to X are covered by leaves
        for (int time = 0; time <= A.length; time++) {
            // Check if the current position A[time] is less than or equal to X, which means it's a valid position for the frog to jump on
            if (A[time] <= X) {
                // Add the current position A[time] to the set of positions found
                positionsFound.add(A[time]);
            }

            // Check if all positions from 1 to X are covered by leaves, which means the size of the set of positions found should be equal to X
            if (positionsFound.size() == X) {
                // Return the current time, which is the earliest time when all positions from 1 to X are covered by leaves
                return time;
            }
        }

        // If we finish iterating through the array and not all positions from 1 to X are covered by leaves, return -1 to indicate that it's not possible for the frog to jump across
        return-1;
    }
}
