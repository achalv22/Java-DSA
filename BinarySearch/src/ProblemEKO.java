public class ProblemEKO {
    public static int FindMaxElementOfAnArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int FindTotal(int[] arr, int mid) {
        int total = 0;
        for (int j : arr) {
            if (j - mid >= 0) {
                total += j - mid;
            }
        }
        return total;
    }

    public static int FindHeight(int[] arr, int n) {
        int start = 0;
        int end = FindMaxElementOfAnArray(arr);
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            int total = FindTotal(arr, mid);
            if (total > n) {
                start = mid + 1;
            } else if (total == n) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 42, 40, 26, 46};
        int n = 20;
        System.out.println(FindHeight(arr, n));
    }
}
