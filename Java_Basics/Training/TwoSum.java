package Training;

// This problem solves Brute Force Pattern
// The pattern appears in:
//  - Pair Problems
//  - Triplet Problems
//  - Subarrays
//  - String Combinations

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5};
        int[] result = twoSum(nums, 9);
        if (result.length == 2) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No Results Found");
        }
    }
}