package Training;

// This is meant to import hashmap for temporary storage
import java.util.HashMap;

public class TwoSumFast {
    //  A new method is created to handle twoSumFast
    public static int[] twoSumFast(int[] nums, int target) {
        //  A new variable name map is created and it is assigned to HashMap. So any thing assigned to map it is linked directly to HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        //  A one loop is created to go through each value in the array list
        for (int i = 0; i < nums.length; i++) {
            //  The value in target is subtracted from each value in nums array list and the value is assigned to needed
            int needed = target - nums[i];

            // Check if we've already seen the number needed to reach the target
            if (map.containsKey(needed)) {
                // Found the pair: return indices of the two numbers
                return new int[]{map.get(needed), i};
            }

            // Store the current number and its index for future lookup
            map.put(nums[i], i);
        }

        //  Incase no value fits the criteria we return an empty set
        return new int[]{};
    }

    //  This phase is a method meant to be reused in many methods, it has the value for nums, and target.
    public static void main(String[] args) {
        //  This represent the input of nums values
        int[] nums = {2, 5, 5, 11};
        //  The value for result is assigned from the method twoSumFast, which is then align with target and it will run the method above
        int[] result = twoSumFast(nums, 10);
        // If we get two values on results then we can run it's output but if their is more than 2 or less outcome then we run the else statement which has the error term
        if (result.length == 2) {
            //  result[0] will represent the 1st value in result as result[1] will represent the 2nd element
            System.out.println(result[0] + ", " + result[1]);
        } else {
            // This acts like an error term
            System.out.println("No results found");
        }
    }
}