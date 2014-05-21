package com.eatmybits.floobits.prime

class PrimeNumberTypicalStrategy implements PrimeNumberSolverStrategy{
    @Override
    boolean isPrime(number) {
        def isPrime = false
        if(number != null){
            if(number > 2){
                isPrime = (2..Math.sqrt(number)).every { number % it != 0 }
            }else{
                isPrime = number == 2
            }
        }
        return isPrime
    }
}
