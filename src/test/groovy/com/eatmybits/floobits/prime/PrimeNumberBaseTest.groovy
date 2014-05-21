package com.eatmybits.floobits.prime

import org.junit.Before
import org.junit.Test

class PrimeNumberBaseTest {
    PrimeNumber primNum
    final static def RANGE = (0..100)
    final static def PRIMES = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

    def findPrimes0To100() {
        RANGE.findAll{primNum.isPrime(it)}
    }
    void setup(PrimeNumberSolverStrategy strategy){
        primNum = new PrimeNumber(strategy)
    }
    boolean testNull(){
        primNum.isPrime(null)
    }
}