public class AddingDigitsInStrings {
    public static void main(String[] args) {
        String s = "1wed136543hgfd87654";
        char[] ch = s.toCharArray();
        int add = 0;
        for (Character a : ch) {
            if (Character.isDigit(a)) {
                //Each character digit is stored as an ASCII value in Java.
                add = add + Character.getNumericValue(a);
            }
        }
        System.out.print(add);
    }
}
