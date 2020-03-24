package com.rajivg;

import java.util.HashMap;
import java.util.Map;

public class FourElements {

    /**
     * For a given input array, finds first 2 pairs whose sum are equal.
     *
     * @param array - integer inputs with distinct ints
     * @return - array of 4 ints whose sum are equals, null if 2 pairs are not found
     */
    public static int[] execute(int[] array) {
        // Map of Sum and their corresponding pairs
        Map<Integer, Object> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (map.containsKey(sum)) {
                    // we have found another pair
                    int[] firstPair = (int[]) map.get(sum);
                    return new int[]{firstPair[0], firstPair[1], array[i], array[j]};
                } else {
                    // Record sum and their pairs
                    map.put(sum, new int[]{array[i], array[j]});
                }
            }
        }
        // Didn't find 2 pairs, so return null
        return null;
    }
}
