package DSA.Prefix_Sums;

public class PassingCars {
    public int solution(int[] A) {
        // Implement your solution here
        // Initialize a variable to count the number of passing pairs and a variable to count the number of east-bound cars
        int passingPairs = 0;
        int eastCars = 0;

        // Iterate through the input array and count the number of passing pairs by counting the number of east-bound cars and adding that count to the total number of passing pairs whenever we encounter a west-bound car
        for (int car : A) {
            // Check if the current car is an east-bound car (represented by 0) and increment the count of east-bound cars, or if it's a west-bound car (represented by 1) and add the count of east-bound cars to the total number of passing pairs
            if (car == 0) {
                eastCars++;
            } else {
                // When we encounter a west-bound car, we add the number of east-bound cars we've seen so far to the total count of passing pairs, since each east-bound car will pass the current
                passingPairs += eastCars;

                // Check if the total number of passing pairs exceeds the limit of 1,000,000,000 and return -1 if it does, as specified in the problem statement
                if (passingPairs > 1000000000) {
                    return -1;
                }
            }
        }

        // Return the total number of passing pairs after iterating through the entire input array
        return passingPairs;
    }
}
