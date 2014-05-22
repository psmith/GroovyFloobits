package com.eatmybits.floobits.prime.strategy

import com.eatmybits.floobits.prime.IsPrime


class PrimeNumberBigIntStrategy implements IsPrime{
    @Override
    boolean isPrime(Integer number) {
        number == null ? false : new BigInteger(number).isProbablePrime(10)
    }
}
