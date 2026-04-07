public class BasicBinarySearch {

    private static int searchNumber(int k, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                mid = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9,10};
        System.out.println(searchNumber(10, arr));
    }
}
