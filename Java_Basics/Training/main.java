package Training;

public class main {
    public static void main(String[] args) {
        int[] nums = { 20, 3, 4, 5, 6};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }
}
