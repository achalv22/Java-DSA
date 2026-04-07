public class Sqrt {
    public static int mySqrt(int x) {
        long start = 0;
        long end = x;
        long mid = (start + end) / 2;
        long ans = 0;

        while (start <= end) {
            if (mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
