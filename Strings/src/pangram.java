public class pangram {

//    public boolean checkIfPangram(String sentence) {
//        for(char i='a';i<='z';i++)
//        {
//            if(sentence.indexOf(i)==-1)
//            {
//                return false;
//            }
//
//        }
//        return true;
//    }

    public static boolean checkIfPangram(String sentence) {
        int []arr=new int[26];
        for(int i=0;i<sentence.length()-1;i++)
        {
            arr[sentence.charAt(i)-97]++;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
  // String sentence = "abcdefghijklmnopqrstuvwxyz";
  // String s="thequickbrownfoxjumpsoverthelazydog";
        String s="leetcode";
        System.out.println(checkIfPangram(s));
    }
}
