package com.company.leetcode;

public class StringToInteger {

    public static void main(String[] args) {
        String s = "-91283472332".trim();
        long maxValue = 2147483647;
        long minValue = -2147483648;


        if(s.length() > 0) {
            char fc = s.charAt(0);
            if ((fc >= 97 && fc <= 122) || (fc >= 65 && fc <= 90) || (fc != '+' && fc != '-' && !Character.isDigit(fc))) {
                System.out.println(0);
            } else {
                int i = (fc == '+' || fc == '-') ? 1 : 0;

                for(; i < s.length(); i++) {
                    if(!Character.isDigit(s.charAt(i))) break;
                }
                long num = Long.parseLong(s.substring(0,i));
                if(num < 0 && num < minValue) {
                    num = minValue;
                }
                if(num > 0 && num > maxValue) {
                    num = maxValue;
                }
                System.out.println(num);
            }
        }

        // when ketan is coding, do not use this java file.

    }

}