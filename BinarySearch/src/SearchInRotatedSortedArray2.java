public class SearchInRotatedSortedArray2 {

    public static int findrotatingpoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end])
                start = mid + 1;
            else if (arr[mid] < arr[end])
                end = mid;
            else
                end--;
        }
        return start;
    }

    public static boolean search(int[] arr, int target) {
        int min = findrotatingpoint(arr);

        for (int i = 0; i < min; i++) {
            if (arr[i] == target) return true;
        }

        for (int i = min; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int t = 0;
        System.out.println(search(arr, t));
    }
}
