public class SwappingOfTwoNumbersUsingBitManipulation {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        System.out.print("before");
        System.out.print(" a : "+a);
        System.out.println(" b : "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("after");
        System.out.print(" a : "+a);
        System.out.println(" b : "+b);

    }
}
