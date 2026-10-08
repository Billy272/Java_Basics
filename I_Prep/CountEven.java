package I_Prep;

public class CountEven {
    
    int[] numbers = { 3, 8, 5, 12, 7, 4};

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
        System.out.println("The count of even numbers is: " + obj.countEven(obj.numbers));
    }
}
