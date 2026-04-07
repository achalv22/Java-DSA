package array;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 33, 0, 3, 2, 10, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }

        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
