package I_Prep;

public class SecondLargest {
    
    int[] numbers = { 8, 12, 4, 15, 10};

    public int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < largest) {
                secondLargest = numbers[i]++;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        System.out.println("The Second Largest value is: " + obj.findSecondLargest(obj.numbers));
    }
}
