package com.eatmybits.floobits.prime

import org.junit.Test

class PrimeNumberTest {
    @Test
    void nullShouldNotBePrime(){
        assert !PrimeNumber.isPrime(null)
    }
}
