package de.verdox.simplejava.lektionen;

public class Kapitel5 {
    public static void main(String[] args) {
        rec(100);
    }
    public static int rec(int i){
        System.out.println(i);
        if(i == 0)
            return 0;
        return rec(i-1);
    }
}
