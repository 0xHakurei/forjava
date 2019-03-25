package com.codewar.code.kyu6;
/*
 * Kata Addr : https://www.codewars.com/kata/your-order-please/train/java
 * 
 * Your task is to sort a given string. Each word in the string will 
 * contain a single number. This number is the position the word should 
 * have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. 
 * The words in the input String will only contain valid consecutive 
 * numbers.
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 * */
public class Order {
    public static String order(String words) {
        if(words == "") {
                  return "";
            }
        String[] tmp = words.split(" ");
        String[] convert = new String[tmp.length];
        for(int i = 0; i < tmp.length; i++) {
            String pos = String.valueOf(i + 1);
            for(int j = 0; j < tmp.length; j++) {
                if(String.valueOf(tmp[j]).contains(pos)){
                    convert[i] = tmp[j];
                }
            }
        }
        String result = "";
        for(int i = 0; i < convert.length - 1; i++) {
            result += convert[i] + " "; 
        };
        result += convert[convert.length - 1];
        return result;
    }
}
