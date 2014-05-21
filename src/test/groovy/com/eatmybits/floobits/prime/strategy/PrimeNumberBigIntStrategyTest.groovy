package com.eatmybits.floobits.prime.strategy

import org.junit.Before
import org.junit.Test

class PrimeNumberBigIntStrategyTest extends PrimeNumberBaseTest{

    @Before
    void setup(){
        setup(new PrimeNumberBigIntStrategy())
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
