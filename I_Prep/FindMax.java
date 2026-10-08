package I_Prep;

public class FindMax {
    
    int[] numbers = { -14, -3, -27, -9, -21};

    public int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindMax obj = new FindMax();
        System.out.println("The max value is: "+ obj.findMax(obj.numbers));
    }
}
