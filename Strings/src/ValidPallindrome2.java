public class ValidPallindrome2{


        public static boolean checkPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

        public static boolean validPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (checkPalindrome(s.substring(i + 1, j + 1)) || checkPalindrome(s.substring(i, j))) {
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
       // String s="aabbaaa";
        System.out.println(validPalindrome("aabbaaa"));

    }
}
