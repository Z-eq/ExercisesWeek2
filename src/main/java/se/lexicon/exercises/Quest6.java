package se.lexicon.exercises;

public class Quest6 {
    public static void main(String[] args) {

            int zeq[]={43,5,23,17,2,14};
            double sum=0;

            for(int counter=0;counter<zeq.length;counter++){
                sum+=zeq[counter];
            }
            System.out.println(sum/zeq.length );

        }
    }

