public class SearchInRotatedSortedArray {
    public static int findRotatingPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (arr[mid] > arr[start] && arr[start] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] > arr[start] && arr[start] < arr[end]) {
                end = mid - 1;
            } else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    public static int search(int[] arr, int target) {
        int start;
        int end;
        int min = findRotatingPoint(arr);

        if (min == 0) {
            start = 0;
            end = arr.length - 1;
        } else if (target < arr[0]) {
            start = min;
            end = arr.length - 1;
        } else {
            start = 0;
            end = min - 1;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 0, 1, 2};
        int t = 5;
        System.out.println(search(arr, t));
    }
}
