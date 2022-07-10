package com.Lesson3;

import java.util.Scanner;

public class DefineColourOfRainbow {
    //По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).

    public static void main(String[] args) {
        int colourNumber;

        colourNumber=integerPositiveNumber();
        System.out.println("Returned to the main program colourNumber=" +colourNumber);
        /* Доработать программу так, чтобы метод defineColourOfRainbow вызывался из main и в него передавалась
        * переменная colourNumber */
    }

    public static int integerPositiveNumber() {
        boolean flag = true;
        int enteredNumber=0;
        Scanner myscan = new Scanner(System.in);

        while (flag) {
            System.out.println("Enter integer positive number:");
            if (myscan.hasNextInt()) {
                enteredNumber = myscan.nextInt();
                System.out.println("Entered number=" + enteredNumber);
                if (enteredNumber >0) defineColourOfRainbow(enteredNumber);
                 else {
                    System.out.println("Entered number is not positive");
                    flag = false;
                }
            } else {
                System.out.println("Entered number is not integer");
                flag = false;
            }
        } //while
        return enteredNumber;
    }//method
        public static void defineColourOfRainbow(int colourNumber) {
        String colour;

        switch (colourNumber) {
            case 1:
                {colour = "red";
                    System.out.println("colourNumber=" +colourNumber +" colour-" +colour);
                } break;
            case 2:
            {colour = "orange";
                System.out.println("colourNumber=" +colourNumber +" colour-" +colour);
            } break;
            case 3:
            {colour = "yellow";
                System.out.println("colourNumber=" +colourNumber +" colour-" +colour);
            } break;
            case 4:
            {colour = "green";
                System.out.println("colourNumber=" +colourNumber +" colour-" +colour);
            } break;
            default: System.out.println("Number positive integer, but out of accepted range");
        }
    }
}
