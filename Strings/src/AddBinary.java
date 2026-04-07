public class AddBinary {
    public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder s1 = new StringBuilder(a);
        StringBuilder s2 = new StringBuilder(b);

        while (s1.length() < s2.length()) {
            s1.insert(0, 0);
        }

        while (s1.length() > s2.length()) {
            s2.insert(0, 0);
        }

        int idx = s1.length() - 1;

        while (idx >= 0) {
            char first = s1.charAt(idx);
            char second = s2.charAt(idx);

            int tmp = carry + (first - 48) + (second - 48);
            if (tmp == 0) {
                result.insert(0, '0');
                carry = 0;
            } else if (tmp == 1) {
                result.insert(0, '1');
                carry = 0;
            } else if (tmp == 2) {
                result.insert(0, '0');
                carry = 1;
            } else {
                result.insert(0, '1');
                carry = 1;
            }
            idx--;
        }

        if (carry == 1) {
            return result.insert(0, '1').toString();
        } else {
            return result.toString();
        }
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
