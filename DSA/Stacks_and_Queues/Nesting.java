package DSA.Stacks_and_Queues;

// This class implements a solution to the Nesting problem, which is a 
// common coding challenge that asks for the validity of parentheses in a 
// string.
// This is mainly used in projects like:
// 1. Code Editors and IDEs: To ensure that code is properly structured and
//    to provide features like auto-indentation and syntax highlighting.
// 2. Compilers and Interpreters: To validate the syntax of programming
//    languages and ensure that code is correctly structured before execution.
// 3. Expression Evaluators: To validate mathematical expressions and ensure
//    that they are properly formed before evaluation.
// The function uses a simple counter (balance) to keep track of the number
// of opening parentheses. It increments the counter for each opening parenthesis 
// and decrements it for each closing parenthesis. If at any point the 
// counter becomes negative, it means there is a closing parenthesis without 
// a corresponding opening parenthesis, and the function returns 0 to 
// indicate that the parentheses are not properly nested. Finally, 
// if the counter is zero at the end of the string, it means all 
// parentheses are properly nested, and the function returns 1
// otherwise, it returns 0. This approach efficiently checks for valid 
// nesting of parentheses in a single pass through the string.

public class Nesting {
    public int solution(String S) {
        // Implement your solution here
        int balance = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                return 0;
            }
        }

        if (balance == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}