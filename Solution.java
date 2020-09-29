package ru.mirea.pr5;

public class Solution {
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}