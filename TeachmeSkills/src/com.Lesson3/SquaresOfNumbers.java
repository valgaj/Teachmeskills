package com.Lesson3;

public class SquaresOfNumbers {
    /* 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20
     * включительно.*/

    // Сделаю программу со встроенным методом Math.pow(value, powValue); Сейчас не успеваю


    public static void main(String[] args) {
        int[] numbers = new int[11];//{10,11,12,13..20}
        numbers[0] = 10;

        squaresOfNumbers(numbers);
    }

    public static void squaresOfNumbers(int[] numbers) {
        long squareOfNumber; /*squareOfNumber = numbers[i] * numbers[i]; integer multiplication implicitly
                             * cast to long */
        int i;
        for (i = 0; i <= 10; i++) {
            squareOfNumber = numbers[i] * numbers[i];
            System.out.println("basic number=" + numbers[i] + " Square of number=" + squareOfNumber);
            if (i < 10) numbers[i + 1] = numbers[i] + 1;
        }
    }
}
