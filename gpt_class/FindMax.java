package gpt_class;

public class FindMax {
    
    int[] numbers = {4, 7, 2, 9, 3};

    public int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindMax obj = new FindMax();
        System.out.println("Max Value: " + obj.findMax(obj.numbers));
    }
}
