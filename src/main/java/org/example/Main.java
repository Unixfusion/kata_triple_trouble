package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        long i = 451999277L;
        long j = 411777228L;
        System.out.println(tripleDouble(i, j));
    }
    public static int tripleDouble(long num1, long num2)
    {

        HashMap<Character, Integer> temp1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> temp2 = new HashMap<Character, Integer>();

        for (char one: Long.toString(num1).toCharArray())
        {
            if (temp1.containsKey(one)) {
                temp1.computeIfPresent(one, (k, v) -> v+1);
            } else temp1.put(one, 1);
        }

        for (char one: Long.toString(num2).toCharArray())
        {
            if (temp2.containsKey(one)) {
                temp2.computeIfPresent(one, (k, v) -> v+1);
            } else temp2.put(one, 1);
        }
        int result = compare(threeOf(temp1), twoOf(temp2));
        return result;
    }
    private static String threeOf(HashMap<Character, Integer> map3) {
    String result = "";
        for (Map.Entry<Character, Integer> pair : map3.entrySet()) {
            if (pair.getValue() >= 3) {
                result += pair.getKey();
            }
        }
        return result;
    }
    private static String twoOf(HashMap<Character, Integer> map3) {
        String result = "";
        for (Map.Entry<Character, Integer> pair : map3.entrySet()) {
            if (pair.getValue() >= 2) {
                result += pair.getKey();
            }
        }
        return result;
    }
    private static int compare(String three, String two) {
        int result = 0;
        for (char a: three.toCharArray()) {
            if (two.contains(Character.toString(a))) {
                result =1;
            }
        }
        return result;
    }
}