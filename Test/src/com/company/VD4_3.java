package com.company;

public class VD4_3 {
    public static void main(String[] args) {
        int lowerbound = 7;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number;
            number = number + 7;
        }
        System.out.print("Tong tu "+ lowerbound + " den " + upperbound + " la " + sum);
    }
}
