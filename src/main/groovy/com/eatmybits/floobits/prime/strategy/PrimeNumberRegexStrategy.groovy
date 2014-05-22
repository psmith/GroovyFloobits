package com.eatmybits.floobits.prime.strategy

import com.eatmybits.floobits.prime.IsPrime

class PrimeNumberRegexStrategy implements IsPrime{

    public boolean isPrime(Integer number) {
       number == null ? false : !("1" * number ==~ '^1?|(..+?)\\1+')
    }

    public static void main(String[] args){
        (1..100).findAll{isPrime(it)}.each{println it}
    }
}
