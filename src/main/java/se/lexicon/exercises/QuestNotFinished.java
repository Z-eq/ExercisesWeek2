package se.lexicon.exercises;

import java.util.Scanner;

public class QuestNotFinished {

//11

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
                break;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }

//TODO!!!! Study this case more!

}