package com.codewar.code.kyu6;

/*
 * Kata Addr : https://www.codewars.com/kata/duplicate-encoder/train/java
 * The goal of this exercise is to convert a string to 
 * a new string where each character in the new string is "(" 
 * if that character appears only once in the original string, 
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 * 
 * Examples : 
 * ==========================
 * |"din"      =>  "((("    |
 * |"recede"   =>  "()()()" |
 * |"Success"  =>  ")())())"|
 * |"(( @"     =>  "))(("   |
 * ========================== 
 * */
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
            String result = "";
            for(int i = 0; i < word.length(); i++) {
                char tmp = word.charAt(i);
                result += word.lastIndexOf(tmp) == word.indexOf(tmp) ? "(" : ")";
            }
            return result;
      }
}
