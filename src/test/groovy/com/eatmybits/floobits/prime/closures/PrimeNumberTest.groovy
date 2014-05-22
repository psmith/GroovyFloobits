package com.eatmybits.floobits.prime.closures

import com.eatmybits.floobits.prime.PrimeNumberBaseTest
import org.junit.Test

class PrimeNumberTest extends PrimeNumberBaseTest{
    private static final PrimeNumber typical = PrimeNumber.computeWithTypicalComputationStrategy()
    private static final PrimeNumber regex = PrimeNumber.computeWithRegexComputationStrategy()

    @Test
    void testRegexStrategy() {
        primNum = regex
        assert !testNull()
        assert PRIMES == findPrimes0To100()
    }
    @Test
    void testTypicalStrategy() {
        primNum = typical
        assert !testNull()
        assert PRIMES == findPrimes0To100()
    }
}