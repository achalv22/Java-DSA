package org.example;

public class ReverseBit {
    public static void main(String[] args) {
        int result=0;
        int n=43261596;
        for (int i=0;i<32;i++)
        {
           int bit=n&1;
           result=(result<<1)|bit;
           n=n>>1;
        }
        System.out.println(result);
    }
}
