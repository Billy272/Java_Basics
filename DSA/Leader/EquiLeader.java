package DSA.Leader;

// This class implements a solution to the EquiLeader problem, which is a
// common coding challenge that asks for the number of equi leaders in an array.
// An equi leader is an index S such that 0 ≤ S < N − 1 and the leader of the
// sequence A[0], A[1], ..., A[S] is the same as the leader of the sequence 
// A[S + 1], A[S + 2], ..., A[N − 1].

// It best to solve this problem in two steps:
// 1. Find the leader of the entire array using the Boyer-Moore majority vote algorithm.
// 2. Count the number of equi leaders by iterating through the array and keeping
//    track of the count of the leader in the left and right parts of the array.

// In real projects, this algorithm can be useful in scenarios such as:
// 1. Data Analysis: To identify points in a dataset where the dominant element changes,
//    which can be useful for tasks like market research, user behavior analysis, or
//    any situation where you need to find shifts in majority elements.
// 2. Voting Systems: To determine points in a voting process where the majority shifts,
//    which can be useful in elections or decision-making processes to identify critical points.
// 3. Performance Optimization: To optimize performance in cases where you need to quickly identify shifts in dominant elements
//    in a large dataset, which can be useful in fields like machine learning, natural language processing,
//    or any situation where you need to identify changes in prevalent features or characteristics in data.


public class EquiLeader {
    public int solution(int[] A) {
        // Implement your solution here
        int N = A.length;
        if (N == 0) return 0;

        // Find the candidate for leader
        int candidate = -1;
        int size = 0;
        for (int value : A) {
            if (size == 0) {
                candidate = value;
                size++;
            } else if (value == candidate) {
                size++;
            } else {
                size--;
            }
        }

        // Verify the candidate and get total count
        int totalLeaderCount = 0;
        for (int value : A) {
            if (value == candidate) totalLeaderCount++;
        }

        // If no leader is found return 0
        if (totalLeaderCount <= N / 2) return 0;

        // Count equi leaders
        int equiLeaders = 0;
        int leftLeaderCount = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] == candidate) {
                leftLeaderCount++;
            }

            int rightLeaderCount = totalLeaderCount - leftLeaderCount;

            if (leftLeaderCount > (i + 1) / 2 && rightLeaderCount > (N - i - 1) / 2) {
                equiLeaders++;
            }
        }

        return equiLeaders;
    }
}
