package se.lexicon.exercises;

public class Quest11 {
    public static void main(String[] args) {


        // Prints diagonal number of first ,middle and last of each row!

        int[][] diagonal = { { 1, 2, 3}, { 2, 4, 6}, {3, 6, 9} };

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
               System.out.print(diagonal[i][j] +  "  ");  // Show rows
            }

            System.out.println();
        }
        for (int k = 0; k < diagonal.length; k++) {

            System.out.print( diagonal[k][k]);  // print reluslt of
        }
    }
}