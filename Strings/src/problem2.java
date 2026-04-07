public class problem2 {
    public static void main(String[] args) {
        String str="vishwakarma";
        StringBuilder charcount=new StringBuilder();
        // int i=0;
        int j=1;
        char ch[]=str.toCharArray();
        for(Character c:ch) {
            while (j <= ch.length) {
                if (c == str.charAt(j)) {
                    int n = Character.charCount(c);
                    charcount.append(n);
                }


            }
        }
        System.out.println(str);

    }
    }

