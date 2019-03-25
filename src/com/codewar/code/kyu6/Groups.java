package com.codewar.code.kyu6;

import java.util.Stack;

/*
 * Kata Addr : https://www.codewars.com/kata/checking-groups/train/java
 * 
 * In English and programming, groups can be made using symbols such as 
 * () and {} that change meaning. However, these groups must be closed in
 *  the correct order to maintain correct syntax.
 *  Your job in this kata will be to make a program that checks a string 
 *  for correct grouping. For instance, the following groups are done 
 *  correctly:
 *  ({})
 *  [[]()]
 *  [{()}]
 *  The next are done incorrectly:
 *
 *  {(})
 *  ([]
 *  [])
 * A correct string cannot close groups in the wrong order, open a group
 *  but fail to close it, or close a group before it is opened.
 *
 * Your function will take an input string that may contain any of the 
 * symbols (), {} or [] to create groups.
 * It should return True if the string is empty or otherwise grouped 
 * correctly, or False if it is grouped incorrectly.
 * */
public class Groups {
    public static boolean groupCheck(String s){
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
