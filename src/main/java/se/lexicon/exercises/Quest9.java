package se.lexicon.exercises;

import java.util.Arrays;

public class Quest9 {

    public static void main(String[] args) {

        int[] worldCups = {2014, 2018, 2022};
        int n  = worldCups.length;
        int nextworldCup[] = new int[n+1];
        int value =2026;

        System.out.println("Original Arrays: " + Arrays.toString(worldCups));
        for(int i = 0; i<n; i++) {
            nextworldCup[i] = worldCups[i];
        }
        nextworldCup[n] = value;
        System.out.println("Added extra array: " +Arrays.toString(nextworldCup));
    }
}
