package array;

public class NextGreatestNumber {
    public static int[] findNextGreatestNumber(int arr[]) {
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5};
        int arr1[] = findNextGreatestNumber(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
