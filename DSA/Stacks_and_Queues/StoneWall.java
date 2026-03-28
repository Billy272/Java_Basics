package DSA.Stacks_and_Queues;

import java.util.Stack;

// This class implements a solution to the Stone Wall problem, which is 
// a common coding challenge that asks for the minimum number of blocks 
// needed to build a stone wall with given heights.
// The function takes an array of integers (H) as input, where each element
// represents the height of a section of the wall. The solution uses a stack
// to keep track of the heights of the blocks currently being used to build the wall.
// As we iterate through the heights in the input array, we compare the current 
// height with the height of the block on top of the stack. If the current height
// is less than the height of the block on the stack, it means we need to remove
// blocks from the stack until we find a block that is shorter than or equal to the current height.
// In real projects, it can be used in fields like:
// 1. Construction and Architecture: To optimize the use of materials and 
// ensure that structures are built efficiently.
// 2. Game Development: To manage resources and optimize performance when 
// rendering complex scenes or structures.
// 3. Data Compression: To minimize the number of elements needed to 
// represent a sequence of data, which can be useful in various applications 
// such as image compression or data storage.
public class StoneWall {
    public int solution(int[] H) {
        // Implement your solution here
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int h : H) {
            while (!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < h) {
                stack.push(h);
                count++;
            }
        }

        return count;
    }
}
