package I_Prep;

public class FindMin {
    
    int[] numbers = { -8, -3, -12, -5, -100};

    public int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        FindMin obj = new FindMin();
        System.out.println("The min value is: " + obj.findMin(obj.numbers));
    }
}
