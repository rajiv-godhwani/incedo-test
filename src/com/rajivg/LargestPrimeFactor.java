package com.rajivg;


public class LargestPrimeFactor {

    /**
     * For a given number n>0 , finds the largest prime factor
     *
     * @param number - Positive integer
     * @return Largest prime factor
     */
    public static int execute(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("No factor for zero.");
        }
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}
