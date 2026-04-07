public class FirstOccuranceOfAString {
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        while (j <= i) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == needle.length() - 1) {
                    i++;
                    break;
                }
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i - needle.length();
    }

    public static void main(String[] args) {
        String str1 = "butiiiisadsad";
        String str2 = "sad";
        System.out.println(strStr(str1, str2));
    }
}
