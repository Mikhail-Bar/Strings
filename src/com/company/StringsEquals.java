package com.company;

public class StringsEquals {
    public static void main(String[] args) {
        //Сравнение строк. Последовательно убирайте комментарии.
        String s1 = "first", s2 = "first";
        StringBuilder sb = new StringBuilder("first");
        String s3 = "fir";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(sb.toString()));
        System.out.println(s1.contains(s3));

        String left = s1.substring(2,4);
        System.out.println(left);

        //Собрать строку из символов
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '3',
                c6 = '6', c7 = '0', c8 = '\u00B0';
        String s4 = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s4);

        System.out.printf("Symbol:%c, number:%d%n", c2, (int) c2);
        //Сложение строк
        String s5 = s1+s2;
        System.out.println(s5);

        String s6 = s1.concat(s2);
        System.out.println(s6);

        StringBuilder sb2 = new StringBuilder(s1);
        sb2.append(s2);
        String s7 = sb2.toString();
        System.out.println(s7);

        //Содержит ли строка только цифры
        System.out.println(isOnlyDigits("123a"));

        //Хеш код строки
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //Замена символа в строке

        String s8 = "machine.";
        System.out.println(s8);
        String s9 = s8.replace('.','!');
        System.out.println(s9);

        //Удалить все символы из выражения

        String s10 = "{w}{{sdf}}";
        String s11 = s10.replaceAll("[{}]","");
        System.out.println(s10);
        System.out.println(s11);

        //Удаление пробелов

        String s12 = "   word     ";
        System.out.println(s12);
        s12 = s12.trim();
        System.out.println(s12);
    }

    static boolean isOnlyDigits (String s){
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}
