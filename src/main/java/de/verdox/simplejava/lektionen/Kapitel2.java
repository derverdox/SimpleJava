package de.verdox.simplejava.lektionen;

public class Kapitel2 {

    public static void main(String[] args) {

        // Ergänzung zu letzter Woche

        // 1. IntelliJ - Klassen und main Methode erstellen
        // 2. Whileschleife vorzeitig abbrechen? -> Break

        // Bedingte Anweisungen

        int zahl = 5;

        if(zahl == 5){

        }
        else if(zahl == 6){

        }
        else if(zahl == 7){

        }
        else {
            
        }


        // Arithmetische Operationen
        // Kurzgesagt: Rechnen

        // +
        int a = 1;
        a+=1;
        a = a+1;
        a++;

        // -
        int b = 1;
        b-=1;
        b = b-1;
        b--;



        // *
        int c = 1;
        c*=2;
        c = c*2;



        // /
        int d = 1;
        d/=2;
        d = d/2;


        // Grundlagen Arrays
        int länge = 10;
        int[] meinArray = new int[länge]; //Arrays haben feste Längen!

        int[] meinArray2 = new int[20];
        // 0, 1, 2, 3, 4 ,5 ,6 ,7 ,8, 9, 10

        // array.length <- Liefert Länge des Arrays

        int elementAusArray = meinArray[10]; // <- Erstes Element im Array. In der Klammer wird der index angegeben.

        int counterVar = 0;
        while(counterVar < meinArray.length){
            System.out.println(meinArray[counterVar]);
            counterVar++;
        }

    }

}
