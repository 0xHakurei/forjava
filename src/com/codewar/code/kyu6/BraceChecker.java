package com.codewar.code.kyu6;

import java.util.Stack;

/*
 * Kata Addr : https://www.codewars.com/kata/valid-braces/train/java
 * Write a function that takes a string of braces, 
 * and determines if the order of the braces is valid. 
 * It should return true if the string is valid, 
 * and false if it's invalid.
 * This Kata is similar to the Valid Parentheses Kata, 
 * but introduces new characters: brackets [], and curly braces {}. 
 * Thanks to @arnedag for the idea!
 * All input strings will be nonempty, and will only consist of 
 * parentheses, brackets and curly braces: ()[]{}.
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched 
 * with the correct brace.
 * Examples
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False 
 * */
public class BraceChecker {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        while(!s.isEmpty()) {
            String tmp = s.substring(0, 1);
            s=s.substring(1);
            if(tmp.equals("[") || tmp.equals("{") || tmp.equals("(")) {
                stack.push(tmp);
            }else if(tmp.equals(")") || tmp.equals("}") || tmp.equals("]")) {
                if(stack.isEmpty()) {
                    return false;
                }
                String leftChar = stack.pop();
                if(tmp.equals(")")) {
                    if(!leftChar.equals("(")) {
                        return false;
                    }
                } else if(tmp.equals("}")) {
                    if(!leftChar.equals("{")) {
                        return false;
                    }
                } else if(tmp.equals("]")) {
                    if(!leftChar.equals("[")) {
                        return false;
                    }
                }
            }
        }
         return stack.isEmpty();
     }
}
