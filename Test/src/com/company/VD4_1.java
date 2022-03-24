package com.company;

public class VD4_1 {
    public static void main(String[] args) {
        int lowerbound = 9;
        int upperbound = 899;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number;
            ++number;
        }
        System.out.print("Tong tu "+ lowerbound + " den " + upperbound + " la " + sum);
    }
}
