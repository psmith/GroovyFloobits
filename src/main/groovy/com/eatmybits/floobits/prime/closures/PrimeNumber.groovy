package com.eatmybits.floobits.prime.closures

import com.eatmybits.floobits.prime.IsPrime

class PrimeNumber {
    final IsPrime strategy
    PrimeNumber(PrimeNumCalStrategies strat = PrimeNumCalStrategies.TYPICAL){
        strategy = strat.strategy
    }
    static PrimeNumber computeWithTypicalComputationStrategy(){
        new PrimeNumber(PrimeNumCalStrategies.TYPICAL)
    }
    static PrimeNumber computeWithRegexComputationStrategy(){
       new PrimeNumber(PrimeNumCalStrategies.REGEX)
    }
    boolean isPrime(Integer number){
        strategy.isPrime(number)
    }
}
