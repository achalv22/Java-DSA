import java.util.Arrays;

public class PaintersPartitionProblem {

    public static boolean isPossible(int arr[], int painters, int mid) {
        int count = 1;
        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            if (sum + arr[i] > mid) {
                count++;
                sum = arr[i];
                if (count > painters || sum > mid) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
            i++;
        }
        return true;
    }

    public static int minTime(int[] arr, int painters) {
        int start = 0;
        int end = Arrays.stream(arr).sum();
        int ans = -1;
        if (arr.length < painters) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(arr, painters, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;
        System.out.println(minTime(arr, k));
    }
}
