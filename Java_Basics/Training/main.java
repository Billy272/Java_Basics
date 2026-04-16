package Training;

public class main {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 5, 6};
        System.out.println(findMax(nums));
    }

    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
