package com.rajivg.test;

import com.rajivg.FourElements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourElementsTest {
    @Test
    void execute() {
        // List of input and expected values
        List<Object> inputs = new ArrayList<Object>() {{
            add(new int[]{3, 4, 7, 1, 2, 9, 8});
            add(new int[]{3, 8, 4, 7});

            add(new int[]{65, 30, 7, 90, 1, 9, 8});
            add(null);

            add(new int[]{13, 4, 9, 1, 7, 8, 5});
            add(new int[]{13, 4, 9, 8});

            add(new int[]{1, 6, 3, 9, 2, 10});
            add(new int[]{1, 10, 9, 2});
        }};

        for (int x = 0; x < inputs.size(); x += 2) {
            int[] pairs = FourElements.execute((int[]) inputs.get(x));
            int[] expectedPairs = inputs.get(x + 1) == null ? null : (int[]) inputs.get(x + 1);
            assertArrayEquals(expectedPairs, pairs);
        }


    }

}