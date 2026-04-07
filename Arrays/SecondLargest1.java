package array;

public class SecondLargest1 {
    public static int[] sortArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int sorrtedarr[] = sortArr(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sorrtedarr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = sorrtedarr.length - 1; i >= 0; i--) {
            if (sorrtedarr[i] < max) {
                System.out.println(sorrtedarr[i]);
                break;
            }
        }
        int count = 0;
        int thirdLargest = 0;
        for (int i = sorrtedarr.length - 1; i >= 0; i--) {
            if (sorrtedarr[i] < max) {
                thirdLargest = sorrtedarr[i];
                count++;
                if (count == 2)
                    break;
            }
        }
        System.out.println(thirdLargest);
    }
}
