public class FirstAndLastOccurance {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        int fo = -1;
        int lo = -1;

        while (start <= end) {
            if (nums[mid] == target) {
                fo = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }

        start = 0;
        end = nums.length - 1;
        mid = (start + end) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                lo = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }

        return new int[]{fo, lo};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(searchRange(arr, 8)[0] + " " + searchRange(arr, 8)[1]);
    }
}
