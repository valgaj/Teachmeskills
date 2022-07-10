package com.Lesson3;

public class DisplayDifferentSeguences {
    /* 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
      При решении используйте операцию инкремента (++).
    * 2. Необходимо вывести на экран числа от 5 до 1.
    *  При решении используйте операцию декремента (--).
    * 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..*/

 public static void main (String[] args){

     displayOddNumbers();
     displayNumbersDescendingOrder();
     firstNumbersOfSubsequence ();
 } //main
  public static void displayOddNumbers() {
      int i;
      int maxNumber=99;
      for (i = 1; i <= maxNumber; i++) {
          if (!(i % 2 == 0)) System.out.println("i=" + i);
      }
  } //end of the method  displayOddNumbers()

    public static void displayNumbersDescendingOrder() {
     System.out.println(System.lineSeparator() +"Launch of method displayNumbersDescendingOrder");
       //System.lineSeparator() сделает перевод строки и в Windows и в Linux.
     int j;
     int maxNumber=5;
     System.out.println("displayNumbersDescendingOrder maxNumber=" +maxNumber);
     for(j=maxNumber;j>=1;j--) {
         System.out.println("j="+j);
     }
    } //end of the method  displayNumbersDescendingOrder()

    public static void firstNumbersOfSubsequence (){
     // 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
     int i=1;
     int maxNumber=10;
     int numberInSequence=0;

     System.out.println(System.lineSeparator() +"Method firstNumbersOfSubsequence\n" +"i=" +i +" numberInSequence=" + numberInSequence);
     for (i=2;i<=maxNumber;i++){
             numberInSequence = numberInSequence - 5;
             System.out.println("i=" + i + " numberInSequence=" + numberInSequence);
         }

    }
}
