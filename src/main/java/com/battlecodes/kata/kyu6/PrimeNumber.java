package com.battlecodes.kata.kyu6;

import java.util.stream.IntStream;

/**
 * Define a function that takes an integer argument and returns logical value true or false
 * depending on if the integer is a prime.
 *
 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has
 * no positive divisors other than 1 and itself.
 *
 * Example
 * is_prime(1) false
 * is_prime(2) true
 * is_prime(-1) false
 * Assumptions
 *      You can assume you will be given an integer input.
 *      You can not assume that the integer will be only positive.
 *      You may be given negative numbers as well(or 0).
 *      There are no fancy optimizations required,but still the most trivial solutions
 *      might time out.Try to find a solution which does not loop all the way up to n.
 */
final class PrimeNumber {

    private static final int CERTAINTY = 20;

    private PrimeNumber() {
    }

    static boolean isPrimeClassic(int num) {
        if (num == 2) {
            return true;
        }

        if ((num < 2) || (num%2==0)) {
            return false;
        }

        for (int i=3; i < (Math.sqrt(num) + 1); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeStream(int num) {
        if (num == 2) return true;
        if ((num < 2) || (num%2==0)) return false;

        return !IntStream.rangeClosed(3, (int) Math.sqrt(num) + 1).filter(x -> (num%x == 0)).findAny().isPresent();
    }

    static boolean isPrimeBig(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(CERTAINTY);
    }
}
