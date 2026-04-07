import java.util.*;

public class NumberToHexadecimal {
    public static void main(String[] args) {

        int n =26;


       /// System.out.println(n);
        Map<Integer,Character> map=new HashMap<>(6);
        List<Integer> list=new ArrayList<>();
        map.put(10,'A');
        map.put(11,'B');
        map.put(12,'C');
        map.put(13,'D');
        map.put(14,'E');
        map.put(15,'F');
        int quot=0;
        int rem=0;
        String ans="";

        while (n != 0) {
            rem = n & 15;     // ✅ FIX: get last 4 bits
            list.add(rem);
            n = n >>> 4;      // ✅ FIX: unsigned shift
        }
        Integer[] arr = list.toArray(new Integer[0]);
        for (int i= arr.length-1;i>=0;i--) {


            if(arr[i]<10) {
                ans = ans + arr[i];
            }
            else {
                ans=ans+map.get(arr[i]);
            }
        }

        System.out.println(ans);
    }
}
