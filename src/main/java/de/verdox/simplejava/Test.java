package de.verdox.simplejava;

import static de.verdox.simplejava.SimpleJava.*;

public class Test {
    public static void main(String[] args) {

        writeConsole("Hallo, dies ist ein Test!");

        int input = readInt();

        if(input <= 0){
            writeConsole("Die Zahl ist kleiner gleich 0");
        }
        else{
            writeConsole("Die Zahl ist größer gleich 0");
        }
    }
}
