package gpt_class;

public class Main {
    
    int[] numbers = { 4, 7, 2, 9, 10};

    public int firstGreaterThanFive() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 5) {
                System.out.println(numbers[i]);
                return numbers[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.firstGreaterThanFive();
    }
}
 