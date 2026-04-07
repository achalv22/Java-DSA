public class SumOfNumbersInString {
    public static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    public static int findSum(String s) {
        int i = 0;
        int sum = 0;
        StringBuilder temp = new StringBuilder();

        while (i < s.length()) {
            if (isDigit(s.charAt(i))) {
                temp.append(s.charAt(i));
                if (!temp.isEmpty() && i == s.length() - 1) {
                    sum = sum + Integer.parseInt(temp.toString());
                }
            } else {
                if (!temp.isEmpty()) {
                    sum = sum + Integer.parseInt(temp.toString());
                    temp = new StringBuilder();
                }
            }
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum("1abc23"));
    }
}
