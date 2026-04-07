public class DivideTwoIntegers {
    public static int dividetwoint(int dividend, int divisor) {
        long start = 0;
        long n1 = (dividend < 0) ? -(long) dividend : (long) dividend;
        long n2 = (divisor < 0) ? -(long) divisor : (long) divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long mid;
        long end = n1;
        long temp = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * n2 <= n1) {
                temp = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            return (int) -temp;
        } else {
            return (int) temp;
        }
    }

    public static void main(String[] args) {
        int n1 = -2147483648;
        int n2 = -1;
        System.out.println(dividetwoint(n1, n2));
    }
}
