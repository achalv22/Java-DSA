public class AllPossiblePallindromeInAString {

    public static void checkOddPalindrome(int i, String s) {
        int j = i;
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                System.out.println(s.substring(i, j + 1));
                i--;
                j++;
            } else {
                break;
            }
        }
    }
    public static void checkEvenPalindrome(int i, String s) {
        int j = i + 1;
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                System.out.println(s.substring(i, j + 1));
                i--;
                j++;
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        String s = "abbaeae";
        for (int i = 0; i < s.length(); i++) {
            checkOddPalindrome(i, s);
            checkEvenPalindrome(i, s);
        }
    }
}//o(n^2)
