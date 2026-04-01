package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

// This class implements a solution to the Robots Collision problem, 
// which is a common coding challenge that involves simulating the 
// movement and collision of robots on a line. Each robot has a 
// position, health, and direction (either left or right). When two 
// robots collide, the one with higher health survives while the 
// other is destroyed. If both robots have the same health, they 
// both get destroyed. The function takes three parameters: an array 
// of positions, an array of healths, and a string representing the 
// directions of the robots. The function returns a list of integers 
// representing the healths of the surviving robots after all 
// collisions have been resolved. This can be useful in scenarios 
// such as game development, physics simulations, or any situation 
// where you need to model interactions between moving entities.

public class RobotsCollision {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        // Sort indices as per their positions
        Arrays.sort(indices, (a, b) -> Integer.compare(positions[a], positions[b]));

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i : indices) {
            if (directions.charAt(i) == 'R') {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && healths[i] > 0) {
                    int topIdx = stack.peek();

                    if (healths[i] > healths[topIdx]) {
                        // Left robot wins
                        healths[topIdx] = 0;
                        healths[i] -= 1;
                        stack.pop();
                    } else if (healths[i] < healths[topIdx]) {
                        // Right robot wins
                        healths[topIdx] -= 1;
                        healths[i] = 0;
                    } else {
                        // Both robots are destroyed
                        healths[topIdx] = 0;
                        healths[i] = 0;
                        stack.pop();
                    }
                }
            }
        }

        // Collect survivors in order
        List<Integer> result = new ArrayList<>();
        for (int h : healths) {
            if (h > 0) result.add(h);
        }

        return result;
    }
}
