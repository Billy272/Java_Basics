package DSA.Iterations;

// This class contains a method to find the longest sequence of zeros in the binary representation of a given integer N, where the sequence is surrounded by ones on both sides.
// In real life, this can be used in scenarios such as analyzing binary data, 
// optimizing storage by identifying patterns in binary representations, or 
// in any situation where you need to find gaps or sequences of zeros in a 
// binary format. For example, it could be used in network communication to 
// analyze packet structures, in data compression algorithms to identify 
// redundant bits, or in digital signal processing to find periods of inactivity.

public class BinaryGap {
    public int solution(int N) {
        // Convert the integer to binary string
        String binaryInteger = Integer.toBinaryString(N);

        // Initialize variables to keep track of the maximum gap and the current gap
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = true;

        // Iterate through the binary string to find the longest sequence of zeros between ones
        for ( int i = 0; i < binaryInteger.length(); i++ ) {
            // Get the current character in the binary string
            char c = binaryInteger.charAt(i);

            // If the current character is '1', check if we were counting a gap of zeros
            if (c == '1') {
                if (counting) {
                    // If we were counting a gap of zeros, check if the current gap is greater than the maximum gap found so far
                    if (currentGap > maxGap) {
                        // Update the maximum gap if the current gap is greater than the maximum gap found so far
                        maxGap = currentGap;
                    }
                }

                // Reset the current gap and start counting again
                currentGap = 0;

                // Set counting to true to indicate that we are now counting a new gap
                counting = true;
            } else if (counting) {
                // If the current character is '0' and we are counting, increment the current gap
                currentGap++;
            }
        }

        // Return the maximum gap found
        return maxGap;
    }
}
