package com.eatmybits.floobits.prime

class PrimeNumberRegexStrategy implements PrimeNumberSolverStrategy{

    public boolean isPrime(number) {
       number == null ? false : !("1" * number ==~ '^1?|(..+?)\\1+')
    }

    public static void main(String[] args){
        (1..100).findAll{isPrime(it)}.each{println it}
    }
}
