public class LongestPalindromicSubsequence {
    public static int ispallindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }
        return str.length();
    }

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int maxLen = 0;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                int len = ispallindrome(sub);
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
}
