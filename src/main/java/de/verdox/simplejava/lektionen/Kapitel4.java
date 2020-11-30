package de.verdox.simplejava.lektionen;

public class Kapitel4 {
    public static void main(String[] args) {

        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[5];

        System.out.println("Länge des Arrays1: "+array1.length);
        System.out.println("Länge des Arrays2: "+array2.length);

        System.out.println("Summe des Arrays1: "+sumOfArray(array1));
        printArray(array1);
        printArray(array2);

        int sum = sumOfArray(array1);
    }

    static void printArray(int[] array){
        System.out.print("Array1: ");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
