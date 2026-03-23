package DSA.Stacks_and_Queues;

import java.util.Stack;

// This class implements a solution to the Brackets problem, which is a common coding 
// challenge that asks for the validation of a string containing various types of 
// brackets (parentheses, square brackets, and curly braces). The function uses 
// a stack data structure to keep track of the opening brackets and ensures that 
// each closing bracket corresponds to the most recently opened bracket. 
// If the string is properly nested and all brackets are matched correctly, 
// the function returns 1; otherwise, it returns 0. This can be useful in
// scenarios such as parsing expressions, validating code syntax, or any situation 
// where you need to ensure that delimiters are properly balanced.

public class Brackets {
    public int solution(String S) {
        // Implement your solution here
        // Create a stack to keep track of the opening brackets encountered in the input string
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string S to validate the brackets
        for (char c : S.toCharArray()) {
            if (c == '('|| c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If the current character is a closing bracket, we need to check if it matches the most recently opened bracket on the stack. If the stack is empty at this point, it means there is no corresponding opening bracket for the current closing bracket, so we return 0 to indicate that the brackets are not properly nested.
                if (stack.isEmpty()) return 0;

                // Pop the most recently opened bracket from the stack to check if it matches the current closing bracket (c)
                char top = stack.pop();

                // Check if the current closing bracket (c) matches the most recently opened bracket (top) on the stack. If it does not match, return 0 to indicate that the brackets are not properly nested.
                if (c == ')' && top != '(') return 0;
                if (c == ']' && top != '[') return 0;
                if (c == '}' && top != '{') return 0;
            }
        }

        // After iterating through the entire input string, we check if the stack is empty. If the stack is empty, it means that all opening brackets have been properly matched with their corresponding closing brackets, so we return 1 to indicate that the brackets are properly nested. If the stack is not empty, it means there are unmatched opening brackets remaining, so we return 0 to indicate that the brackets are not properly nested.
        return stack.isEmpty() ? 1 : 0;
    }
}
