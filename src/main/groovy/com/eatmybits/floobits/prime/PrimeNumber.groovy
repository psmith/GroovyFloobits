package com.eatmybits.floobits.prime

class PrimeNumber {
    final PrimeNumberSolverStrategy context
    PrimeNumber(PrimeNumberSolverStrategy context = new PrimeNumberRegexStrategy()){
        this.context = context
    }
    boolean isPrime(number){
        context.isPrime(number)
    }
}
