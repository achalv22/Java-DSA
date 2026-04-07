public class PrintDigitsAndAlphabets {
    public static void main(String[] args) {
        String s = "%jBHU976*&+{Ppp32";
        char[] ch = s.toCharArray();
        String digits = "";
        String alphabets = "";
        for (Character a : ch) {
            if (Character.isDigit(a)) {
                digits += a;
            } else if (Character.isAlphabetic(a)) {
                alphabets += a;
            }
        }
        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + alphabets);
    }
}


