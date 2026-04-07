public class FactorialUsingRecursion {
    public static int getFactorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*getFactorial(num-1);
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(getFactorial(num));
    }
}
