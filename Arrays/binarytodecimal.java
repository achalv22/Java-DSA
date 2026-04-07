package array;

public class binarytodecimal {
    public static int todecimal(int num) {
        String s = Integer.toString(num);
        int ans = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - 48;
            ans = ans + (digit * (int) Math.pow(2, pow));
            pow++;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(todecimal(11010));
    }
}
