package com.codewar.code.kyu6;
import java.util.Random;

/*
 * Kata Addr : https://www.codewars.com/kata/html-dynamic-color-string-generation/train/java
 * Generate a valid randomly generated rgb color string. 
 * Assume all of them have 6 digits always.
 * 
 * */

public class GenerateColorRGB {
    public static String generateColor(Random r) {
        String R, G, B;
        
        R = Integer.toHexString(r.nextInt(256));
        G = Integer.toHexString(r.nextInt(256));
        B = Integer.toHexString(r.nextInt(256));
        
        R = R.length() == 1 ? "0" + R : R;
        G = G.length() == 1 ? "0" + G : G;
        B = B.length() == 1 ? "0" + B : B;
        
        return "#" + R + G + B;
    }
}
