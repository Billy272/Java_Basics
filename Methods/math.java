package Java_Basics.Methods;

public class math{  
   public int sumNumbers (int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

/**
 * 
 */
public static void main(String[]) {
    math m = new math();
    int s = m.sumNumbers(9,19);
    System.out.println("Sum is: " + s);
 }

}
