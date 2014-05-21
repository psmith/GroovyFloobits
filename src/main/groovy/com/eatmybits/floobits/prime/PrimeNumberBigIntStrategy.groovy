package com.eatmybits.floobits.prime


class PrimeNumberBigIntStrategy implements PrimeNumberSolverStrategy{
    @Override
    boolean isPrime(number) {
        number == null ? false : new BigInteger(number).isProbablePrime(10)
    }
}
