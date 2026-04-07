public class FirstPivotElement1 {
    public static int pivotIndex(int[] nums) {
        int left_sum = 0;
        int total_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total_sum = total_sum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int right_sum = total_sum - current - left_sum;
            if (right_sum == left_sum) {
                return i;
            }

            left_sum = left_sum + current;
        }
        return -1;


    }

    public static void main(String[] args) {
        //int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums = {-1, -1, -1, -1, -1};
        System.out.println(pivotIndex(nums));
    }
}
