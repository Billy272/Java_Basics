package DSA.Sorting;

import java.util.Arrays;

// This class implements a solution to the Number of Disc Intersections problem,
// which is a common coding challenge that asks for the number of pairs of
// intersecting discs given an array of integers representing the radii of the discs.
// The solution calculates the left and right boundaries of each disc, sorts these boundaries,
// and then counts the number of intersections by iterating through the sorted boundaries.
// The algorithm uses a two-pointer technique to efficiently count the intersections while 
// ensuring that the count does not exceed a specified limit. This can be useful in various
// applications such as physics simulations, collision detection in computer graphics, or any
// scenario where you need to determine the number of overlapping intervals or interactions between objects.

// In real life, this algorithm can be applied in scenarios such as:
// 1. Physics Simulations: In simulations involving particles or objects 
//    that can be represented as discs, this algorithm can be used to count the number of interactions
//    between the objects, which can be crucial for understanding the dynamics of the system.
// 2. Collision Detection: In computer graphics or game development, this algorithm can be used to
//    detect collisions between circular objects, which is essential for realistic physics and 
//    interactions in the game environment.
// 3. Network Analysis: In scenarios where you have entities that can be represented as discs
//    (e.g., communication ranges of devices), this algorithm can help count the number of 
//    interactions or overlaps between these entities, which can be useful for optimizing
//    network performance or understanding connectivity.
public class NumberOfDiscIntersection {
    public int solution(int[] A) {
        // Implement your solution here
        // Calculate the length of the input array A and store it in a variable N for later use in accessing elements of the array
        int N  = A.length;
        long[] leftBoundary = new long[N];
        long[] rightBoundary = new long[N];

        // Calculate the left and right boundaries of each disc based on their 
        // center position (index) and radius (value in the array A).
        // The left boundary is calculated as the index minus the radius, 
        // and the right boundary is calculated as the index plus the radius. 
        // These boundaries are stored in separate arrays for later sorting and 
        // counting of intersections.
        for (int i = 0; i < N; i++) {
            leftBoundary[i] = (long) i - A[i];
            rightBoundary[i] = (long) i + A[i];
        }

        // Sort the left and right boundary arrays to facilitate the counting of intersections.
        Arrays.sort(leftBoundary);
        Arrays.sort(rightBoundary);

        // Initialize variables to count the number of intersections, the number of 
        // active discs, and a pointer for the right boundary array. The variable 
        // 'intersections' will keep track of the total number of intersecting pairs 
        // of discs, while 'activeDiscs' will count how many discs are currently 
        // active (i.e., have started but not yet ended) as we iterate through the 
        // left boundaries. The pointer 'j' will be used to iterate through the right 
        // boundaries to determine when discs end.
        int intersections = 0;
        int activeDiscs = 0;
        int j = 0;

        // Iterate through the sorted left boundaries of the discs. For each left boundary,
        // we check how many active discs there are at that point, which represents the number of
        // intersections with the current disc. We also check if any discs have ended 
        // (i.e., their right boundary is less than the current left boundary) and update 
        // the count of active discs accordingly. If the total number of intersections exceeds 
        // the specified limit, we return -1 as required by the problem statement.
        for (int i = 0; i < N; i++) {
            while (j < N && rightBoundary[j] < leftBoundary[i]) {
                activeDiscs--;
                j++;
            }

            intersections += activeDiscs;

            if (intersections > 10_000_000) {
                return -1;
            }

            activeDiscs++;
        }

        // Return the total number of intersections found after iterating through all the left boundaries.
        return intersections;
    }
}
