import java.util.Arrays;

public class AllocateMinimumPages {

    public static boolean possible(int[] pages, int students, int mid) {
        int count = 1;
        int sum = 0;
        int i = 0;

        while (i < pages.length) {
            if (sum + pages[i] > mid) {
                count++;
                sum = pages[i];
                if (count > students || sum > mid) {
                    return false;
                }
            } else {
                sum += pages[i];
            }
            i++;
        }
        return true;
    }

    public static int findPages(int[] arr, int students) {
        int start = 0;
        int end = Arrays.stream(arr).sum();
        int ans = -1;

        if (arr.length < students) {
            return -1;
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (possible(arr, students, mid)) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {15, 17, 20};
        int k = 5;
        System.out.println(findPages(arr, k));
    }
}
