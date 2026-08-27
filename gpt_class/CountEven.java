package gpt_class;

public class CountEven {
    
    int[] numbers = {4, 7, 2, 9, 3, 8, 10};

    public int countEven(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountEven obj = new CountEven();
        System.out.println("Count of Even: " + obj.countEven(obj.numbers));
    }
}
