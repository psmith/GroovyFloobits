package com.eatmybits.floobits.prime

import org.junit.Test

class NumberTransformerTest {
    @Test
    void shouldTransformA3DigitNumber() {
        NumberTransformer.threeDigitPositiveNumber("123") == 123
    }

    @Test
    void shouldNotTransformA2DigitNumber() {
        NumberTransformer.threeDigitPositiveNumber("12") == -1
    }
}