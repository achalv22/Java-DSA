import java.util.HashSet;
import java.util.LinkedHashSet;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int carry = 0;
        int sum;

        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int n1, n2;
        while (i >= 0 || j >= 0) {
            n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            i--;
            j--;

            sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            result.insert(0, sum);

        }
        if (carry != 0) result.insert(0, carry);

        return result.toString();
    }

    public static int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int k_copy = k;

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (char ch : set) {
            while (j < s.length()) {
                if (ch == s.charAt(j)) {
                    max = Math.max(max, j - i + 1);
                    j++;
                } else {
                    if (k > 0) {
                        max = Math.max(max, j - i + 1);
                        k--;
                        j++;
                    } else {
                        k = k_copy;
                        i++;
                        j = i;
                    }
                }
            }
            i = 0;
            j = 0;
            k = k_copy;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABBB", 2));
        String s1 = "9";
        String s2 = "99";
        System.out.println(addStrings(s1, s2));
    }
}
