package array;

public class largestelement {
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 4, 8, 4, 1, 22, 5, 21, 20};
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) max = j;
        }
        System.out.println("First Largest : " + max);

        int seclargest = 0;
        for (int k : arr) {
            if (max > k && k > seclargest) {
                seclargest = k;
            }
        }
        System.out.println("Second Largest : " + seclargest);

        int thirdlargest = 0;
        for (int j : arr) {
            if (max > j && seclargest > j && j > thirdlargest) {
                thirdlargest = j;
            }
        }
        System.out.println("3rd Largest : " + thirdlargest);
    }
}


