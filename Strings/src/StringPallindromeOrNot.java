public class StringPallindromeOrNot {

    /**
     * Method to checks if given string is palindrome or not.
     *
     * @param str is a test string
     * @return true if string is palindrome, else returns false.
     */
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(isPalindrome(str));
    }
}