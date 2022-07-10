package com.Lesson3;

public class SeasonsOfTheYearIfElseIf {
    /*2. Написать программу для вывода названия поры года по номеру месяца.
При решении используйте оператор if-else-if*/
    public static void main (String[] args){

    int monthsNumber;
    int maxMonthsNumber=12;
    String [] seasonOfTheYear=new String[]{"Winter","Spring","Summer","Autumn"};

    for (monthsNumber=1;monthsNumber<=maxMonthsNumber;monthsNumber++)
    {
        if (monthsNumber == 1 || monthsNumber == 2 || monthsNumber == 12)
        { /*possible to skip {} in this example. I left just for memory*/
            System.out.println("MonthsNumber" + (monthsNumber) + "-" + seasonOfTheYear[0]);
        } else
            if (monthsNumber == 3 || monthsNumber == 4 || monthsNumber == 5)
          {
                System.out.println("MonthsNumber" + monthsNumber + "-" + seasonOfTheYear[1]);
            } else
                if (monthsNumber == 6 || monthsNumber == 7 || monthsNumber == 8)
                {
                    System.out.println("MonthsNumber" + monthsNumber + "-" + seasonOfTheYear[2]);
                }
                else System.out.println("MonthsNumber" + monthsNumber + "-" + seasonOfTheYear[3]);
    } /*for */
}
}/*class*/
