package DSA.Time_Complexity;

public class FrgJmp {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        // Calculate the distance that needs to be covered
        int distance = Y - X;

        // If the distance is less than or equal to zero, it means that the starting point is already at or beyond the target, so no jumps are needed
        if (distance <= 0) {
            // Return 0 since no jumps are needed to cover the distance from X to Y
            return 0;
        }

        // Calculate the number of jumps needed by dividing the distance by the jump distance D
        int jumps = distance / D;

        // If there is a remainder when dividing the distance by D, it means that an additional jump is needed to cover the remaining distance
        if  (distance % D > 0) {
            // Increment the number of jumps by one to account for the additional jump needed to cover the remaining distance
            jumps++;
        }

        // Return the total number of jumps needed to cover the distance from X to Y with jumps of distance D
        return jumps;
    }
}
