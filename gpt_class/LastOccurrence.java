package gpt_class;

public class LastOccurrence {
    
    int[] numbers = {4, 7, 2, 9, 3, 7, 10};

    public int findLast(int[] numbers, int target) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LastOccurrence obj = new LastOccurrence();
        System.out.println("From Last Target Index: "+ obj.findLast(obj.numbers, 10));
    }
}
