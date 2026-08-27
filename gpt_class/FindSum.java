package gpt_class;

public class FindSum {
    
    int[] numbers = {4, 7, 2, 9, 3};

    public int findSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        FindSum obj = new FindSum();
        System.out.println("Total Sum: " + obj.findSum(obj.numbers));
    }
}
