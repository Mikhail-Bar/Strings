package com.company;

public class String2 {
    public static void main(String[] args) {
/*
Задано слово и набор строк.
Проверить, содержит ли этот набор все ротации данной строки.
 */
        String word = "abc";
        String[] rots = {"abc","bca", "cab"};
        int length = word.length();

        for (int i = 0; i < length; i++) {
            if(word.equals(rots[i]))
                flag = true;
            
        }

    }
}
