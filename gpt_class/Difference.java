package gpt_class;

public class Difference {
    
    int[] numbers = {4, 7, 2, 9, 3};

    public int findDifference(int[] numbers) {
        int diff = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
            
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }

        diff = max - min;

        return diff;
    }

    public static void main(String[] args) {
        Difference obj = new Difference();
        System.out.println("Difference is: " + obj.findDifference(obj.numbers));
    }
}
