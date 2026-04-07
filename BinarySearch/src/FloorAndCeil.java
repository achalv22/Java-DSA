public class FloorAndCeil {

    public static int toFindFloor(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] >= x) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return arr[ans];
    }

    public static int toFindCeil(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] <= x) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return arr[ans];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(toFindFloor(arr, x));
        System.out.println(toFindCeil(arr, x));
    }
}
