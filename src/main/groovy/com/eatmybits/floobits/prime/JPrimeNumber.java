package com.eatmybits.floobits.prime;

import java.math.BigInteger;

public class JPrimeNumber {

    public static boolean isPrime(int number) {
        if (number == 2 || number == 3) return true;
        return new BigInteger(String.valueOf(number)).isProbablePrime(1);
    }

}
