package gpt_class;

public class SumEven {
    
    int[] numbers = {8, 7, 2, 9, 10, 3};

    public int sumEvenNumbers(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumEven obj = new SumEven();
        System.out.println("Sum of even: " + obj.sumEvenNumbers(obj.numbers) );
    }
}
