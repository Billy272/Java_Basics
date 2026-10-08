package I_Prep;

public class Sum {

    int[] numbers = { 4, 7, 2, 9, 6};

    public int Sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }

        return sum;
    } 
    
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println("The Sum of even is: "+ obj.Sum(obj.numbers));
    }
}
