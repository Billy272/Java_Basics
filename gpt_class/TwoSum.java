package gpt_class;

import java.util.Arrays;
import java.util.Map;

public class TwoSum {

    int[] numbers = {2, 7, 11, 15};

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        System.out.println("The values to target: "+ Arrays.toString(obj.twoSum(obj.numbers, 18)));
    }
}
