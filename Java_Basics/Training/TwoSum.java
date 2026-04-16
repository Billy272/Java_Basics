package Training;

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
        int[] nums = { 3, 3, 4};
        int[] result =  twoSum(nums, 6);
        if (result.length == 2) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No Solution found");
        }
    }
}
