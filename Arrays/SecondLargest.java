package array;

public class SecondLargest {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int arr[] = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

        }
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i] && arr[i] > secondLargest)
                secondLargest = arr[i];
        }
        System.out.println(secondLargest);
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondLargest && arr[i] > thirdLargest)
                thirdLargest = arr[i];
        }
        System.out.println(thirdLargest);
    }


}
