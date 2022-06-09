package se.lexicon.exercises;

import java.util.Arrays;
public class Quest4 {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 15, 20};

        // copying array 1 >2!
        int[] array2 = Arrays.copyOf(array1, array1.length);
        for (int i : array2) {

        }
                // printing first!
        System.out.print("Elements from first array: ");
        for (int j : array1) {
            System.out.print(j + " ");
        }

        System.out.println();

// Printing second
        System.out.print("Elements from second array: ");
        for (int j : array2) {
            System.out.print(j + " ");
        }
    }
}
