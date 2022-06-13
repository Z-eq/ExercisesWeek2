package se.lexicon.exercises;

import java.util.Arrays;

public class Quest2 {

    // Function to find the index of an element
    public static int indexOf(int arr[], int t) {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] indexOf = {1, 2, 5, 4, 4};

        System.out.println("Index position of 5 is "+
                + indexOf(indexOf, 5));

    }

}