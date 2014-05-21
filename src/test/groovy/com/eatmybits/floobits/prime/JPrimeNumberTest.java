package com.eatmybits.floobits.prime;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class JPrimeNumberTest {

    @Ignore
    public void nullShouldNotBePrime(){
        //assertThat(JPrimeNumber.isPrime(null), is(false));
    }

    @Test
    public void isPrimeShouldReturnTrueWithTheNumber1() {
        assertThat(JPrimeNumber.isPrime(1), is(false));
    }

    @Test
    public void isPrimeShouldReturnTrueWithTheNumber2() {
        assertThat(JPrimeNumber.isPrime(2), is(true));
    }

    @Test
    public void isPrimeShouldReturnTrueWithTheNumber3() {
        assertThat(JPrimeNumber.isPrime(3), is(true));
    }

    @Test
    public void isPrimeShouldReturnFalseWithTheNumber4() {
        assertThat(JPrimeNumber.isPrime(4), is(false));
    }

    @Test
    public void isPrimeShouldReturnFalseWithTheNumber5() {
        assertThat(JPrimeNumber.isPrime(5), is(true));
    }
}
