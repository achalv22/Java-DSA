//printing only digits and alphabet
public class PrintLettersAndDigits {
    public static void main(String[] args) {
        String s = "%jBHU976*&+{Ppp32";
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (Character a : ch) {
            if (Character.isLetterOrDigit(a)) {
                ans.append(a);
            }
        }
        System.out.println(ans);
    }
}
