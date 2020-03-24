package com.rajivg.test;

import com.rajivg.SoldierAndWeapons;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SoldierAndWeaponsTest {
    @Test
    void execute() {
// List of input and expected values
        List<Object> inputs = new ArrayList<Object>() {{
            add(new int[]{0, 0, 1, 0});
            add(new int[]{1, 0, 0, 0});
            add(0);

            add(new int[]{0, 1, 1, 0, 1, 0});
            add(new int[]{1, 1, 1, 0, 1, 0});
            add(1);

            add(new int[]{1, 0, 1, 0});
            add(new int[]{0, 0, 0, 0});
            add(4);

            add(new int[]{0, 1, 0, 1});
            add(new int[]{1, 1, 1, 0});
            add(2);

            add(new int[]{1, 0, 1});
            add(new int[]{1, 1, 0});
            add(0);

        }};

        for (int x = 0; x < inputs.size(); x += 3) {
            int result = SoldierAndWeapons.execute((int[]) inputs.get(x), (int[]) inputs.get(x + 1));
            int expectedResult = (int) inputs.get(x + 2);
            assertEquals(expectedResult, result);
        }
    }

}