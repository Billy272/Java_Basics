package gpt_class;

public class GreaterThanTarget {
    
    int[] numbers = {4, 7, 2, 9, 3, 8, 10};

    public int countGreaterThan(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        GreaterThanTarget obj = new GreaterThanTarget();
        System.out.println("Count: "+ obj.countGreaterThan(obj.numbers, 6));
    }
}
