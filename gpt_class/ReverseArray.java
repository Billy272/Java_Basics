package gpt_class;

public class ReverseArray {
    
    int[] numbers = {4, 7, 2, 9, 3};

    public int[] reverseArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];

            numbers[left] = numbers[right];

            numbers[right] = temp;
            
            System.out.println("New Arrays: " + left + " " + right);

            left++;
            right--;

            
        }

        return numbers;

    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        System.out.println("New Array: " + obj.reverseArray(obj.numbers));
    }
}
