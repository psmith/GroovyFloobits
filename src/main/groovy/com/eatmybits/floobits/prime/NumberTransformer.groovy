package com.eatmybits.floobits.prime

class NumberTransformer {
    public static int threeDigitPositiveNumber(String number) {
        if (number ==~ /\d{3}/) {
            return new Integer(number).intValue()
        }
        return -1
    }
}