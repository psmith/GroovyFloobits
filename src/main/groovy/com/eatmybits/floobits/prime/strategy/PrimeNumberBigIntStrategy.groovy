package com.eatmybits.floobits.prime.strategy


class PrimeNumberBigIntStrategy implements PrimeNumberComputationStrategy{
    @Override
    boolean isPrime(number) {
        number == null ? false : new BigInteger(number).isProbablePrime(10)
    }
}
