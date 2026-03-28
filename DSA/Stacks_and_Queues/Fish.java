package DSA.Stacks_and_Queues;

import java.util.Stack;

// This class implements a solution to the Fish problem, which is a 
// common coding challenge that asks for the number of fish that will 
// survive given their sizes and directions. The function takes two 
// integer arrays as input: 
// A represents the sizes of the fish, and B represents their directions 
// (0 for upstream and 1 for downstream). The solution uses a stack to 
// keep track of the fish moving downstream. 
// As we iterate through the fish, if we encounter a fish moving downstream, 
// we push its size onto the stack. If we encounter a fish moving upstream, 
// we compare its size with the fish on top of the stack (the most recently 
// encountered downstream fish). 
// If the upstream fish is larger, it will eat the downstream fish 
// (pop from the stack). If the downstream fish is larger, the upstream fish 
// will be eaten (break the loop). 
// If the stack is empty after processing an upstream fish, it means 
// that the upstream fish survives. Finally, we return
// the total number of survivors, which is the sum of the surviving upstream fish and the remaining downstream fish in the stack. This approach efficiently 
// handles the interactions between the fish and ensures that we correctly count the survivors based on their sizes and directions.

public class Fish {
    public int solution(int[] A, int[] B) {
        // Implement your solution here
        int survivors = 0;
        Stack<Integer> downstreamStack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downstreamStack.push(A[i]);
            } else {
                while(!downstreamStack.isEmpty()) {
                    if (downstreamStack.peek() > A[i]) {
                        break;
                    } else {
                        downstreamStack.pop();
                    }
                }

                if (downstreamStack.isEmpty()) {
                    survivors++;
                }
            }
        }

        return survivors + downstreamStack.size();
    }
}

