package com.Lesson3;

public class DisplaySequenceWhile {
   /* 4. Необходимо, чтоб программа выводила на экран вот такую
    * последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    * В решении используйте цикл while. */

    public static void main (String[] args){
    DisplaySequencePlus7While();
    }//End of main

    public static void DisplaySequencePlus7While(){
        int number=0;
        int maxNumber=98;
        int i;

        while(number<maxNumber) {
            number=number+7;
            System.out.println("number=" +number);
        }
    }

}//End of Class
