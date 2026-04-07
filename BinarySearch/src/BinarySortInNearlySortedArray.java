public class BinarySortInNearlySortedArray {
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (mid > 0 && arr[mid - 1] == target)
                return mid - 1;
            else if (mid < end && arr[mid + 1] == target)
                return mid + 1;

            if (arr[mid] < target || (mid > 0 && arr[mid - 1] < target))
                start = mid + 2;
            else
                end = mid - 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 40, 20, 50, 80, 90};
        int t = 3;
        System.out.println(search(arr, t));
    }
}
