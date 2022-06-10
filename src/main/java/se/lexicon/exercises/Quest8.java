package se.lexicon.exercises;
import java.util.Arrays;
public class Quest8 {

    public static void main(String[] args) {
        int[] delDuplicate = {1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10};

        Arrays.sort(delDuplicate);
        int j = 0;

        for (int i = 0; i < delDuplicate.length - 1; i++)
            if (delDuplicate[i] != delDuplicate[i + 1]) {
                delDuplicate[j] = delDuplicate[i];
                j++;
            }
   // print only filtered values
        System.out.print("Arrays without duplicated value: ");
        delDuplicate[j] = delDuplicate[delDuplicate.length - 1];
        for (int i = 0; i <= j; i++) {

            System.out.print(delDuplicate[i] + " ");

        }

    }
}