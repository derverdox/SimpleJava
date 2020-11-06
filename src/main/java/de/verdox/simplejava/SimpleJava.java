package de.verdox.simplejava;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Lukas Jonsson
 */

public class SimpleJava {

    public static void main(String[] args) {
        readDouble("Eingabe erwartet");
    }

    private static Scanner input = new Scanner(System.in);

    private static String readInput(String message) {
        writeConsole(message);
        while(input.hasNextLine()){
            String value = input.nextLine();
            if(value == null){
                writeConsole("Eingabe konnte nicht gelesen werden. Bitte erneut versuchen!");
                return readInput(message);
            }
            return value;
        }
        return null;
    }

    public static String readString(String message){
        return readInput(message);
    }

    public static String readString(){
        return readInput("Bitte eingeben: ");
    }

    public static int readInt(String message){
        try{
            return Integer.valueOf(readInput(message));
        }
        catch (NumberFormatException e){
            writeConsole("Bitte geben sie eine Zahl ein: ");
            return readInt(message);
        }
    }

    public static int readInt(){
        return readInt("Bitte geben sie eine Zahl ein!");
    }

    public static int readDouble(){
        return readInt("Bitte geben sie eine Zahl ein: ");
    }

    public static double readDouble(String message){
        try{
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse(readInput(message));
            return number.doubleValue();
        }
        catch (NumberFormatException e){
            writeConsole("Bitte geben sie eine Zahl ein: ");
            return readInt(message);
        } catch (ParseException e) {
            writeConsole("Bitte geben sie eine Zahl ein: ");
            return readInt(message);
        }
    }

    public static void writeConsole(String messageToPrint){
        System.out.println(messageToPrint);
    }

    public static void writeNewLine(){
        System.out.println("");
    }

    public static void write(String messageToPrint){
        System.out.print(messageToPrint);
    }

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
