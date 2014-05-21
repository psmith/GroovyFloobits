package com.eatmybits.floobits.prime.strategy

import com.eatmybits.floobits.prime.strategy.PrimeNumber
import com.eatmybits.floobits.prime.strategy.PrimeNumberComputationStrategy

class PrimeNumberBaseTest {
    PrimeNumber primNum
    final static def RANGE = (0..100)
    final static def PRIMES = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

    def findPrimes0To100() {
        def thinkArePrimes = RANGE.findAll{primNum.isPrime(it)}
        if(PRIMES != thinkArePrimes){
            def shouldBeIn = PRIMES - thinkArePrimes
            def shouldNotBeIn = thinkArePrimes - PRIMES
            throw new RuntimeException("Expected Primes But Missing: ${shouldBeIn}\n" +
                    "Not Expected and Are Not Primes: ${shouldNotBeIn}")
        }
        return thinkArePrimes
    }
    void setup(PrimeNumberComputationStrategy strategy){
        primNum = new PrimeNumber(strategy)
    }
    boolean testNull(){
        primNum.isPrime(null)
    }
}