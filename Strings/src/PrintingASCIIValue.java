public class PrintingASCIIValue {
    public static void main(String[] args) {
        String s = "achal";
        char[] ch = s.toCharArray();
        for (Character c : ch) {
            int c1 = c;
            System.out.println(c + ":" + c1);}
    }
}
