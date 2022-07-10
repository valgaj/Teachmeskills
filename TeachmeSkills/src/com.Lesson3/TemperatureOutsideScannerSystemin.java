package com.Lesson3;

import java.util.Scanner;

public class TemperatureOutsideScannerSystemin {
    /* 4. Для введенного числа t (температура на улице) вывести
     * Если t>–5, то вывести «Тепло».
     * Если –5>= t > –20, то вывести «Нормально».
     * Если –20>= t, то вывести «Холодно».*/

    public static void main (String[] args) {

        System.out.println("Enter temperature");
        Scanner myScanner = new Scanner(System.in);

        /* The part in comments works correctly. Trying  logic with operator while
        * if (myScanner.hasNextInt()) {
        *    int temp = myScanner.nextInt();
        *   System.out.println("Temperature=" + temp);
        *
        *   temperatureOutside(temp);
        *} else System.out.println("Input error. Please, restart the program and enter valid number.");*/

        while (myScanner.hasNextInt()) {
            int temp = myScanner.nextInt();
            System.out.println("Temperature=" + temp);

            temperatureOutside(temp);

            System.out.println("Enter temperature");
        }
        System.out.println("Input error. Please, restart the program and enter valid number.");


    }
    public static void temperatureOutside(int temp) {
        // Operator switch-case is not used as case используется, когда можем прописать строгое равенство
          if (temp>5)
             System.out.println("Warm");//Russian coding displayed wrongly - in "???"
             else
               if (temp<=-5&&temp>-20)
                  System.out.println("Normal");
                 else
                   if (temp<=-20) System.out.println("Cold");
                    else
                      System.out.println ("No condition defined for this temperature");


    }//for method temperatureOutside
}
