package array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            for (; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 5, 11};
        int t = 10;
        int[] result = twoSum(a, t);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}