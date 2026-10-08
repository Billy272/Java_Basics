package gpt_class;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    int[] numbers = {2, 7, 11, 15};

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (counts.containsKey(complement)) {
                return new int[] {counts.get(complement), i};
            }

            counts.put(numbers[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        System.out.println("The values to target: " + Arrays.toString(obj.twoSum(obj.numbers, 18)));
    }
}