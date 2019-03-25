package com.codewar.code.kyu6;

import java.util.function.Function;

/* 
 * Kata Addr : https://www.codewars.com/kata/moves-in-squared-strings-iii/train/java
 * 
 * */
public class Opstrings {
    public static String diag1Sym(String strng) {
        strng = strng.replace("\n", "-");
        String[] tmp = strng.split("-");
        char[][] result = new char[tmp[0].length()][tmp[0].length()];
        for (int i = 0; i < tmp.length; i++) {
            char[] container = tmp[i].toCharArray();
            for (int j = 0; j < tmp[0].length(); j++) {
                result[j][i] = container[j];
            }
        }
        String res = "";
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result.length; j++) {
                res += String.valueOf(result[i][j]);
            }
            res += "\n";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }
    public static String rot90Clock(String strng) {
        strng = strng.replace("\n", "-");
        String[] tmp = strng.split("-");
        char[][] result = new char[tmp[0].length()][tmp[0].length()];
        for (int i = 0; i < tmp.length; i++) {
            char[] container = tmp[tmp.length - i - 1].toCharArray();
            for (int j = 0; j < tmp[0].length(); j++) {
                result[j][i] = container[j];
            }
        }
        String res = "";
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result.length; j++) {
                res += String.valueOf(result[i][j]);
            }
            res += "\n";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }
    public static String selfieAndDiag1(String strng) {
        strng = strng.replace("\n", "-");
        String[] tmp = strng.split("-");
        char[][] result = new char[tmp[0].length()][tmp[0].length()];
        for (int i = 0; i < tmp.length; i++) {
            char[] container = tmp[i].toCharArray();
            for (int j = 0; j < tmp[0].length(); j++) {
                result[j][i] = container[j];
            }
        }
        String res = "";
        for(int i = 0; i < result.length; i++) {
            char[] formerSeq = tmp[i].toCharArray();
            for(int j = 0; j < result.length; j++) {
                res += String.valueOf(formerSeq[j]);
            }
            res += "|";
            for(int j = 0; j < result.length; j++) {
                res += String.valueOf(result[i][j]);
            }
            res += "\n";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}   
