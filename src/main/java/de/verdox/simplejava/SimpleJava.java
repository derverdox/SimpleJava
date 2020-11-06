package de.verdox.simplejava;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SimpleJava {

    public static void main(String[] args) {
        readDouble("Eingabe erwartet");
    }

    private static Scanner input = new Scanner(System.in);

    private static String readInput(String message) {
        printLine(message);
        while(input.hasNextLine()){
            String value = input.nextLine();
            if(value == null){
                printLine("Eingabe konnte nicht gelesen werden. Bitte erneut versuchen!");
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
            printLine("Bitte geben sie eine Zahl ein: ");
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
            printLine("Bitte geben sie eine Zahl ein: ");
            return readInt(message);
        } catch (ParseException e) {
            printLine("Bitte geben sie eine Zahl ein: ");
            return readInt(message);
        }
    }

    public static void printLine(String messageToPrint){
        System.out.println(messageToPrint);
    }

    public static void print(String messageToPrint){
        System.out.print(messageToPrint);
    }

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
