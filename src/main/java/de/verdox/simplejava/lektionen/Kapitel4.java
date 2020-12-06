package de.verdox.simplejava.lektionen;

public class Kapitel4 {
    public static void main(String[] args) {

        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[5];

        int sum = sumOfArray(array1);

        System.out.println("Länge des Arrays1: "+array1.length);
        System.out.println("Länge des Arrays2: "+array2.length);

        System.out.println("Summe des Arrays1: "+sumOfArray(array1));

        //2D Arrays
        int[][] array = new int[10][10];

        for(int y = 0;y < array[0].length; y++){
            for(int x = 0; x < array.length; x++){
                array[x][y] = x+y;
            }
        }

        print2DArray(array);
    }

    static void print2DArray(int[][] array){

        for (int[] ints : array) {
            printArray(ints);
        }
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
