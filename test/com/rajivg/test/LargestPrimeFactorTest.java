package com.rajivg.test;

import com.rajivg.LargestPrimeFactor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {
    @Test
    void execute() {
        List<Integer> inputs = new ArrayList<Integer>(){{
            add(90);
            add(5);

            add(84);
            add(7);

            add(6);
            add(3);

            add(15);
            add(5);

            add(392832);
            add(31);

            add(147);
            add(7);

            add(2);
            add(2);

        }};

        for (int x = 0; x < inputs.size(); x += 2) {
            int factor = LargestPrimeFactor.execute(inputs.get(x));
            int expectedFactor = inputs.get(x + 1);
            assertEquals(expectedFactor, factor);
        }
    }

}