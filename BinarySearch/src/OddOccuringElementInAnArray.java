public class OddOccuringElementInAnArray {
    public static int oddoccuringelement(int []arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return arr[start];
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,4,4,5,5,6,6,7,7,8};
        System.out.println(oddoccuringelement(arr));
    }
}
