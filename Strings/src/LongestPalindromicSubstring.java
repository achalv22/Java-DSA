public class LongestPalindromicSubstring {

    public static String expandAroundIndex(int i, int j, String s, String max) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if (j - i + 1 > max.length()) {
                max = s.substring(i, j + 1);
            }
            i--;
            j++;
        }
        return max;
    }

    public static String longestPalindrome(String s) {
        String max = "";
        int i = 0;
        while (i < s.length()) {
            max = expandAroundIndex(i, i, s, max);
            max = expandAroundIndex(i, i + 1, s, max);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbba"));
    }
}
