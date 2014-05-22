package com.eatmybits.floobits.prime.closures

import com.eatmybits.floobits.prime.IsPrime

public enum PrimeNumCalStrategies {
    REGEX({ number -> number == null ? false : !("1" * number ==~ '^1?|(..+?)\\1+')}),
    TYPICAL({ number ->
        def isPrime = false
        if(number != null){
            if(number > 2){
                isPrime = (2..Math.sqrt(number)).every { number % it != 0 }
            }else{
                isPrime = number == 2
            }
        }
        return isPrime})
    IsPrime strategy

    PrimeNumCalStrategies(IsPrime strategy){
        this.strategy = strategy as IsPrime
    }
}