package gpt_class;

public class Average {
    
    int[] numbers = {10, 20, 30, 40, 50};

    public int findAverage(int[] numbers) {
        int average = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;

        return average;
    }

    public static void main(String[] args) {
        Average obj = new Average();
        System.out.println("Average: " + obj.findAverage(obj.numbers));
    }
}
