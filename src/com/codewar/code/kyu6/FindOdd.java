package com.codewar.code.kyu6;


/*
 *  Kata Addr : https://www.codewars.com/kata/find-the-odd-int/train/java 
 *  Given an array, find the int that appears an odd number of times.
 *  There will always be only one integer that appears an odd number of times.
 */
public class FindOdd {
    public static int findIt(int[] A) {
        for(int i = 0; i < A.length; i++) {
                int sig = 0;
                for (int j = 0; j < A.length; j++) {
                    if(A[i] == A[j]) {
                        sig ++;
                    }
                }
                if(sig % 2 != 0) {
                    return A[i];
                }
            }
            return 0;
      }
}
