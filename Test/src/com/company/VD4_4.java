package com.company;

public class VD4_4 {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number*number;
            ++number;
        }
        System.out.print("Tong tu "+ lowerbound + " den " + upperbound + " la " + sum);
    }
}
