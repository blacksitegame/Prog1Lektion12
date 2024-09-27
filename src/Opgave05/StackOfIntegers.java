package Opgave05;

import java.sql.Array;

public class StackOfIntegers {
    private int[] stackOfIntegers = new int[1000];

    public StackOfIntegers(int number){
        convertNumber(number);
    }

    public void convertNumber(int number){
        int arrayNumber = 0;
        for (int i = number; i>0; i--){
            if (number%i==0){
                this.stackOfIntegers[arrayNumber]=i;
                arrayNumber++;
            }
        }

        for (int i = 0; i<arrayNumber; i++){
            System.out.println(stackOfIntegers[i]);
        }
    }
}
