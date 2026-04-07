public class SearchInsertPosition {
    public static int searchinsertposition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {

            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 14, 18, 25, 30, 40, 50};
        int t = 51;
        System.out.println(searchinsertposition(arr, t));
    }
}
