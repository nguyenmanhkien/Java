package com.company;

public class VD4_5 {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int product = 1;
        int number = lowerbound;
        while (number <= upperbound){
            product = product * number;
            ++number;
        }
        System.out.print("Tich tu "+ lowerbound + " den " + upperbound + " la " + product);
    }
}
