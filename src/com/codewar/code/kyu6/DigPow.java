package com.codewar.code.kyu6;

/*
 * Kata Addr : https://www.codewars.com/kata/playing-with-digits/train/java
 * 
 * */
public class DigPow {
    public static long digPow(int n, int p) {
        String digit = String.valueOf(n);
        char[] tmp = digit.toCharArray();
        long sum = 0;
        long res = -1;
        int plus = p;
        for(int i = 0; i < tmp.length; i++) {
            sum += Math.pow(Character.getNumericValue(tmp[i]), plus);
            plus++;
        }
        if(sum % n == 0) {
            res = sum / n;
        } else {
            res = -1;
        }
        return res;
    }
}
