package com.eatmybits.floobits.prime.strategy

class PrimeNumber {
    final PrimeNumberComputationStrategy context
    PrimeNumber(PrimeNumberComputationStrategy context = new PrimeNumberRegexStrategy()){
        this.context = context
    }
    boolean isPrime(number){
        context.isPrime(number)
    }
}
