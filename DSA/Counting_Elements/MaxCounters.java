package DSA.Counting_Elements;

public class MaxCounters {
     public int[] solution(int N, int[] A) {
        // Implement your solution here
        // Create an array to store the counters, initialized to 0
        int[] counters = new int[N];
        int currentMax = 0;
        int lastUpdate = 0;

        // Iterate through the input array A to update the counters based on the operations specified in A
        for (int x : A) {
            // Check if the current operation is an increment operation (x between 1 and N)
            if (x >= 1 && x<= N) {
                int index = x - 1;

                // If the counter at the current index is less than the last update value, update it to the last update value before incrementing
                if (counters[index] < lastUpdate) {
                    counters[index] = lastUpdate;
                }

                // Increment the counter at the current index
                counters[index]++;

                // Update the current maximum counter value if necessary
                if (counters[index] > currentMax) {
                    currentMax = counters[index];
                }
            // Check if the current operation is a max counter operation (x equal to N + 1)
            } else if (x == N + 1) {
                lastUpdate = currentMax;
            }
        }

        // After processing all operations, ensure that all counters are updated to at least the last update value
        for (int i = 0; i < N; i++) {
            // If the counter at index i is less than the last update value, update it to the last update value
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }

        // Return the final state of the counters after processing all operations
        return counters;
    }
}
