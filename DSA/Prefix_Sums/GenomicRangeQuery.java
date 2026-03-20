package DSA.Prefix_Sums;

// This class contains a method to solve the Genomic Range Query problem, which involves determining the minimal impact factor of nucleotides in specified substrings of a given DNA sequence. The method uses prefix sums to efficiently calculate the presence of each nucleotide (A, C, G) in the substrings defined by the queries, and returns an array of results corresponding to each query.
// In real life, this type of problem can be relevant in bioinformatics and genetics 
// research, where analyzing DNA sequences and understanding the impact of different 
// nucleotides can provide insights into genetic variations, mutations, and their 
// potential effects on organisms. The ability to efficiently query large DNA sequences
// for specific patterns or characteristics is crucial in many applications,
// such as identifying disease markers, studying evolutionary relationships, 
// and developing personalized medicine approaches.
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // Implement your solution here
        // Calculate the length of the input string and the number of queries, and initialize an array to store the results of each query
        int N = S.length();
        int M = P.length;
        // Create an array to store the results of each query, with a size equal to the number of queries (M)
        int[] result = new int[M];

        // Create a 2D array to store the prefix sums for each nucleotide (A, C, G), with 3 rows (one for each nucleotide) and N + 1 columns (to account for the prefix sums up to each position in the string)
        int[][] prefixSums = new int[3][N + 1];
        // Iterate through the input string and calculate the prefix sums for each nucleotide at each position
        for (int i = 0; i < N; i++) {
            int a = 0, c = 0, g = 0;
            char nucleotide = S.charAt(i);
            // Check the current nucleotide and update the corresponding count (a, c, g) based on whether it is 'A', 'C', or 'G'. If the nucleotide is 'A', set a to 1; if it is 'C', set c to 1; if it is 'G', set g to 1. If the nucleotide is 'T', all counts will remain 0 since it does not contribute to the prefix sums for A, C, or G.
            if (nucleotide == 'A') a = 1;
            else if (nucleotide == 'C') c = 1;
            else if (nucleotide == 'G') g = 1;

            // Update the prefix sums for each nucleotide at the current position (i + 1) by adding the values from the previous position (i) and the current nucleotide counts (a, c, g)
            prefixSums[0][i + 1] = prefixSums[0][i] + a;
            prefixSums[1][i + 1] = prefixSums[1][i] + c;
            prefixSums[2][i + 1] = prefixSums[2][i] + g;
        }

        // Iterate through each query defined by the arrays P and Q, and determine the minimal impact factor for the substring defined by the start index (P[i]) and end index (Q[i]) for each query. The impact factors are determined based on the presence of nucleotides A, C, G, and T in the substring, with A having an impact factor of 1, C having an impact factor of 2, G having an impact factor of 3, and T having an impact factor of 4. The prefix sums are used to efficiently determine the presence of each nucleotide in the substring by comparing the prefix sums at the end index and start index for each nucleotide.
        for (int i = 0; i < M; i++) {
            int start = P[i];
            int end = Q[i] + 1;

            // Check the prefix sums for each nucleotide to determine the minimal impact factor for the substring defined by the start and end indices. If the difference in prefix sums for 'A' is greater than 0, it means 'A' is present in the substring, so we set the result for this query to 1. If 'A' is not present but 'C' is present (difference in prefix sums for 'C' is greater than 0), we set the result to 2. If neither 'A' nor 'C' is present but 'G' is present (difference in prefix sums for 'G' is greater than 0), we set the result to 3. If none of 'A', 'C', or 'G' are present, it means only 'T' is present, so we set the result to 4.
            if (prefixSums[0][end] - prefixSums[0][start] > 0) {
                result[i] = 1;
            } else if (prefixSums[1][end] - prefixSums[1][start] > 0) {
                result[i] = 2;
            } else if (prefixSums[2][end] - prefixSums[2][start] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        // Return the array containing the results of each query, which represents the minimal impact factor for the specified substrings in the input string based on the presence of nucleotides A, C, G, and T.
        return result;
    }
}
