package com.Lesson3;

public class SeasonsOfTheYearSwitchCase {
   /* 1. Написать программу для вывода названия поры года по номеру месяца.
    При решении используйте оператор switch-case. */

    public static void main(String[] args) {

        seasonOfTheYearSwitchCase();
    }

    public static void seasonOfTheYearSwitchCase() {
        int monthsNumber;
        int maxMonthsNumber= 11;
           /* String[] months = new String[]{"January","February","March","April","June","July","August", "September","October","November",
                    "December"};*/

        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        for (monthsNumber = 0; monthsNumber <= maxMonthsNumber; monthsNumber++) {
            switch (monthsNumber) {
                case 0, 1, 11: {
                    System.out.println("Month's number" + (monthsNumber + 1) + "-" + seasons[0]);
                }
                break;
                case 2, 3, 4: {
                    System.out.println("Month's number" + (monthsNumber + 1) + "-" + seasons[1]);
                }
                break;
                case 5, 6, 7: {
                    System.out.println("Month's number" + (monthsNumber + 1) + "-" + seasons[2]);
                }
                break;
                case 8, 9, 10: {
                    System.out.println("Month's number" + (monthsNumber + 1) + "-" + seasons[3]);
                }
                break;

                default:
                    System.out.println("Something went wrong");
            } //switch ends
        } // Circle for ends
    }//Method SeasonOfTheYear ends
}
