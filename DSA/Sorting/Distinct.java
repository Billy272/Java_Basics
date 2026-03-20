package DSA.Sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length ==0) {
            return 0;
        }

        Set<Integer> distinctValues = new HashSet<>();

        for (int value : A) {
            distinctValues.add(value);
        }

        return distinctValues.size();
    }
}
