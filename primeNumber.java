package com.company;

public class primeNumber {
    public static void main(String [] args) {
        for(int num = 2; num <=10; num++) {
            boolean isPrime = true;
            for(int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println(num);
            }
        }
    }
}