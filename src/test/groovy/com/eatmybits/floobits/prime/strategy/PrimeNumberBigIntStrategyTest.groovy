package com.eatmybits.floobits.prime.strategy

import com.eatmybits.floobits.prime.PrimeNumberBaseTest
import org.junit.Before
import org.junit.Test

class PrimeNumberBigIntStrategyTest extends PrimeNumberBaseTest{

    @Before
    void setup(){
        primNum = new PrimeNumber(new PrimeNumberBigIntStrategy())
    }

    @Test
    void shouldFindAllPrimesFrom0To100(){
        assert PRIMES == findPrimes0To100()
    }

    @Test
    void nullIsNotAfPrime() {
        assert !testNull()
    }
}
