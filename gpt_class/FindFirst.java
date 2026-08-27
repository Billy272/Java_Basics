package gpt_class;

public class FindFirst {
    
    int[] numbers = {4, 7, 2, 9, 3, 7, 10};

    public int findFirst(int[] numbers, int target) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindFirst obj = new FindFirst();
        System.out.println("First number index: " + obj.findFirst(obj.numbers, 9));
    }
}
