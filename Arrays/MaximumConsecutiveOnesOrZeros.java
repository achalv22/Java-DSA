package array;

public class MaximumConsecutiveOnesOrZeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt > max) {
                max = cnt;
            }
            //  i=i+1;
        }
        System.out.println(max);
    }
}
