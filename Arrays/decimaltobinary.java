package array;

public class decimaltobinary {
    public static int findBinary(int num) {
        StringBuilder ans = new StringBuilder();
        int rem = 0;
        while (num > 0) {
            rem = num % 2;
            ans.insert(0, rem);
            num = num / 2;
        }
        String s = ans.toString();
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(findBinary(169));
        //"b0101" -> 5
    }
}
