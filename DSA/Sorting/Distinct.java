package DSA.Sorting;

import java.util.HashSet;
import java.util.Set;

// It is best used in projects where you need to determine 
// the number of unique elements in a dataset. Best examples include:
// 1. Data Analysis: When analyzing data, you may want to know how many distinct
//    values are present in a particular column or dataset. This can help in
//    understanding the diversity of the data and making informed decisions based on it.
// 2. Database Management: In database systems, you may want to count the number
//    of distinct entries in a table or a specific column. This can be useful for
//    optimizing queries, understanding data distribution, and ensuring data integrity.
// 3. Machine Learning: When working with machine learning algorithms, you may want
//    to determine the number of distinct classes or categories in a dataset. This
//    can help in selecting appropriate algorithms and evaluating model performance.
// 4. Cybersecurity: In cybersecurity, you may want to identify the number of distinct IP
//    addresses accessing a system or network. This can help in detecting potential
//    threats and understanding the scope of network activity.
public class Distinct {
    public int solution(int[] A) {
        // Implement your solution here
        // Check if the input array is empty, and if it is, return 0 since there are no distinct values in an empty array
        if (A.length ==0) {
            return 0;
        }

        // Create a set to store the distinct values from the input array, since sets automatically handle duplicates and only store unique values
        Set<Integer> distinctValues = new HashSet<>();

        // Iterate through the input array and add each value to the set of distinct values, which will ensure that only unique values are stored in the set
        for (int value : A) {
            distinctValues.add(value);
        }

        // Return the size of the set of distinct values, which represents the number of distinct values in the input array
        return distinctValues.size();
    }
}
