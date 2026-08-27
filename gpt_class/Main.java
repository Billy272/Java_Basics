package gpt_class;

import java.util.HashMap;
import java.util.Map;

public class Main {

    int[] numbers = { 4, 7, 4, 2, 7, 7, 1};

    public int mostFrequent(int[] numbers) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int number : numbers) {
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }
        //  The above is for counting occurences

        int mostFrequent = 0;
        int highestValue = 0;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > highestValue) {
                highestValue = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Most Frequent: " + obj.mostFrequent(obj.numbers));
    }
}