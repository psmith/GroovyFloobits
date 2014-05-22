package com.eatmybits.floobits.prime.strategy

import com.eatmybits.floobits.prime.IsPrime

class PrimeNumber {
    final IsPrime context
    PrimeNumber(IsPrime context){
        this.context = context
    }
    boolean isPrime(number){
        context.isPrime(number)
    }
}
