package com.eatmybits.floobits.prime

import org.junit.Before
import org.junit.Test


class PrimeNumberTypicalStrategyTest extends PrimeNumberBaseTest{
    @Before
    void setup(){
        super.setup(new PrimeNumberTypicalStrategy())
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
