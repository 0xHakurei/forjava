package com.codewar.code.kyu6;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Kata Addr : https://www.codewars.com/kata/find-the-parity-outlier/train/java
 * You are given an array (which will have a length of at least 3, but 
 * could be very large) containing integers. The array is either entirely
 *  comprised of odd integers or entirely comprised of even integers 
 *  except for a single integer N. Write a method that takes the array 
 *  as an argument and returns this "outlier" N.
 * 
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 * 
 * */
public class FindOutlier {
    static int find(int[] integers) {
        int odds = 0;
        int even = 0;
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < integers.length; i++) {
            map.put(integers[i], integers[i] % 2); 
        }
        Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            @SuppressWarnings("rawtypes")
            Entry entry = (Entry) iterator.next();
            int val = (int) entry.getValue();
            if(val == 1 || val == -1) {
                odds++;
            }else {
                even++;
            }
        }
        if(odds == 1) {
            Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
            while(itr.hasNext()) {
                @SuppressWarnings("rawtypes")
                Entry entry = (Entry) itr.next();
                int val = (int) entry.getValue();
                if(val == 1 || val == -1) {
                    return (int)entry.getKey();
                }
            }
        }else if(even == 1) {
            Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
            while(itr.hasNext()) {
                @SuppressWarnings("rawtypes")
                Entry entry = (Entry) itr.next();
                int val = (int) entry.getValue();
                if(val == 0) {
                    return (int)entry.getKey();
                }
            }
        }
        return 0;
    }
}
