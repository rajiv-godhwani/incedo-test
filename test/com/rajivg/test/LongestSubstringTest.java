package com.rajivg.test;

import com.rajivg.LongestSubstring;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    @Test
    void execute() {
        List<Object> inputs = new ArrayList<Object>(){{
            add("abcabcbb");
            add(3);

            add("bbbb");
            add(1);

            add("bdbb");
            add(2);

        }};

        for (int x = 0; x < inputs.size(); x += 2) {
            int length = LongestSubstring.execute((String)inputs.get(x));
            int expectedLength = (int)inputs.get(x + 1);
            assertEquals(expectedLength, length);
        }
    }

}