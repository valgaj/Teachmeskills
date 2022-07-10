package com.Lesson3;

import java.util.Scanner;

public class SummationUpToEnteredNumber {
    /*3. Напишите программу, где пользователь вводит любое целое
     * положительное число. А программа суммирует все числа от 1 до
     * введенного пользователем числа.
     * Для ввода числа воспользуйтесь классом Scanner.*/

    public static void main (String[] args){
        //Лучше сделать проверку на целое положительное тоже отдельным методом.

        int enteredNumber;
        boolean flag=true;

        Scanner myscan=new Scanner(System.in);

        while (flag) {
            System.out.println("Enter integer positive number:");
            if (myscan.hasNextInt()) {
                enteredNumber = myscan.nextInt();
                System.out.println("Entered number=" + enteredNumber);
                if (enteredNumber > 0) {
                    int sum = summationUpToEnteredNumber(enteredNumber);
                } else {
                    System.out.println("Entered number is not positive");
                    flag = false;
                }
            } else {
                System.out.println("Entered number is not integer");
                flag = false;
            }
        } //while
    }
     public static int summationUpToEnteredNumber(int enteredNumber) {
        System.out.println("Entered number got by the method="+ enteredNumber);
         int i;
         int sum = 0;
         for (i = 1; i < enteredNumber; i++) {
             sum = sum + i;
         }
         System.out.println("sum up to the entered number=" +sum);
         return(sum);
     }
}
