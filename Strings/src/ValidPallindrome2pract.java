public class ValidPallindrome2pract {
    public static boolean checkPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean ispallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (checkPallindrome(s.substring(i + 1, j + 1)) || checkPallindrome(s.substring(i, j))) {
                    return true;
                } else {
                    return false;
                }
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(ispallindrome("aabbaaa"));

    }
}
