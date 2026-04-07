

public class ReverseAstringWithoutLoop {
    public static String getRev(String str,int index,String rev)

    {
        if(index<0)
        {
            return  rev;
        }
        rev=rev+str.charAt(index);
        return getRev(str,index-1,rev);

    }
    public static void main(String[] args) {

String s="raju";
        System.out.println(getRev(s,s.length()-1,""));
    }
}
