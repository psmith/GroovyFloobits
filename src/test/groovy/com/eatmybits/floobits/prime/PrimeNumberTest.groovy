package com.eatmybits.floobits.prime

import org.junit.Test

class PrimeNumberTest {

    @Test
    void nullShouldNotBePrime(){
        assert !PrimeNumber.isPrime(null)
    }

    @Test
    void isPrimeShouldReturnFalseWithTheNumber0() {
        assert !PrimeNumber.isPrime(0)
    }

    @Test
    void isPrimeShouldReturnFalseWithTheNumber1() {
        assert !PrimeNumber.isPrime(1)
    }

    @Test
    void isPrimeShouldReturnTrueWithTheNumber2() {
        assert PrimeNumber.isPrime(2)
    }

    @Test
    void isPrimeShouldReturnTrueWithTheNumber3() {
        assert PrimeNumber.isPrime(3)
    }

    @Test
    void isPrimeShouldReturnFalseWithTheNumber4() {
        assert !PrimeNumber.isPrime(4)
    }

    @Test
    void isPrimeShouldReturnTrueWithTheNumber5() {
        assert PrimeNumber.isPrime(5)
    }

    @Test
    void isPrimeShouldReturnFalseWithTheNumber6() {
        assert !PrimeNumber.isPrime(6)
    }

}
