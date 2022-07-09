package com.Lesson2;
import java.util.Scanner;

public class DataTypeTransformationTestDrive {

        public static void main (String[] args) {
            String name="Ivan";
            int age=30;
            byte age1=(byte) age;
            boolean year=true;
            char gender='M';

            dataTypeConverion(name,age1,year,gender);
        }
    public static void dataTypeConverion(String name, byte age, boolean year, char gender) {
           /* byte a=3; */
            int b=17;
            /* String specialist="therapist"; For further experiments:) String doesn't convert to a smaller type chart*/
            char number='7';
            float c=2.7f;

            /* Преобразование типов данных */
            byte a=(byte) b;
            char d=(char) b;
            int abc=(int)c;

            System.out.println("a=" +a +" d=" +d+ " abc " +abc) ;

            if(!year) System.out.println("year is wrong");
                else System.out.println("year is correct");

        long specialistLong =Long.parseLong("FF",16);
            int test =Integer.parseInt("20",10);
            System.out.println("specialistLong:" +specialistLong +" test:"+test);

            System.out.println("Enter time of appointment in float format");
            Scanner time=new Scanner(System.in);
            float timeforAppointment=time.nextFloat();
            /* нужна проверка на корректность введенных данных*/
            System.out.println("timeforAppointment:" +timeforAppointment);
            int timeInt=(int) timeforAppointment;

            System.out.println(" Name:"+ name +" age:" +age +" Gender:"+gender +" timeforAppointmen in Integer:"
                                + timeInt);
        }
    }

