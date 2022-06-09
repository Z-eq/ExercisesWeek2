package se.lexicon.exercises;

public class Quest7 {
    public static void main(String[] args) {

        int[] zeq = {1, 2, 4, 7, 9, 12, 10, 19, 55, 97};
        System.out.print("Array: ");
        for (int i = 0; i < zeq.length; i++) {
            System.out.print(zeq[i] + " ");

        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i< zeq.length; i++) {
            if (zeq[i] % 2 != 0) {
                System.out.print(zeq[i] + " ");

            }

        }

    }
}