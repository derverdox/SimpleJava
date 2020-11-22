package de.verdox.simplejava.lektionen;

public class Kapitel3 {
    public static void main(String[] args) {

        // Agenda für heute

        // 1. For Schleifen

        //for(int i = 0; i < 10; i++){
        //    System.out.println(i);
        //}
        
      //int[] array = new int[]{1,2,3,4,5};

      //for (int i = 0; i < array.length; i++) {
      //    System.out.println(array[i]);
      //}

      //for (int zahlAusArray : array) {
      //    System.out.println(zahlAusArray);
      //}

      //for (int i = array.length - 1; i >= 0; i--) {
      //    System.out.println(array[i]);
      //}

      //for (int i : array) {

      //}

       //// 2. Weitere Datentypen für Zahlen

       //byte a;
       //short b;
       //int c;
       //long d;

       //float e = 1.5f;
       //double f = 1.5;

       //// 3. Methoden

        test1();
        System.out.println(test2(10,2));
        System.out.println(test2(4,2));

        int number; // = some int
    }

    public static void test1(){
        System.out.println("Test");
    }

    public static int test2(int zahl1, int zahl2){
        int number = zahl1 / zahl2;
        return number;
    }

}
