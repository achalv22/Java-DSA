package array;

public class Addingonetonumber {
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        StringBuilder s = new StringBuilder();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int n= arr[i] +carry;
            if (n == 10) {
                s.append(0);
                carry = 1;
            } else {
                s.append(n);
                carry = 0;
            }
        }
        if (carry == 1) {
            s.append(1);
        }

        System.out.println(s.reverse());
    }
}
