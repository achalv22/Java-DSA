public class KOKOEatingBananas {
    public static int findMaxElementOfAnArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static long findTotal(int[] piles, int mid) {
        long total = 0;
        for (int j : piles) {
            total += (int) Math.ceil((double) j / mid);
        }
        return total;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = findMaxElementOfAnArray(piles);
        int mid, ans = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (findTotal(piles, mid) <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 18;
        System.out.println(minEatingSpeed(arr, h));
    }
}
