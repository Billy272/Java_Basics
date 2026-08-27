package gpt_class;

public class FindMin {
    
    int[] numbers = {4, 7, 2, 9, 3};

    public int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        FindMin obj = new FindMin();
        System.out.println("Min Value: " + obj.findMin(obj.numbers));
    }
}
