package com.rajivg;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SoldierAndWeapons {


    /**
     * Returns the number of soldiers who didn't get weapons from the stack
     * @param weapons - Represents stack of weapons
     * @param soldiers - Represent queue of soldiers
     * @return - Unweaponed soldiers
     */
    public static int execute(int[] weapons, int[] soldiers) {
        // FIFO for soldier, LIFO for weapons
        Queue<Integer> soldierQueue = new ArrayDeque<>(soldiers.length);
        Stack<Integer> weaponsQueue = new Stack<>();

        // Fill the stack and queue
        for (int i = 0; i < soldiers.length; i++) {
            soldierQueue.offer(soldiers[i]);
            weaponsQueue.push(weapons[weapons.length - 1 - i]);
        }

        boolean recycled = false;
        int totalCount = soldiers.length;
        int soldiersWithWeapons = 0;
        int count = 0;

        // Recycled = if every soldier in the current queue got a chance to pick weapon, then we end
        while (!recycled) {
            int soldier = soldierQueue.peek();
            int weapon = weaponsQueue.peek();

            if (soldier == weapon) {
                // Soldier ready to fight with weapon
                weaponsQueue.pop();
                soldierQueue.remove();
                count = 0;
                soldiersWithWeapons++;
            } else {
                // Move this soldier to last position
                soldierQueue.remove();
                soldierQueue.offer(soldier);
                // No of soldiers moved to back of queue
                count++;
            }

            recycled = count == soldierQueue.size();
        }

        return totalCount - soldiersWithWeapons;
    }
}
