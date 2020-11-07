package de.verdox.simplejava.lektionen;

public class Kapitel1 {
    public static void main(String[] args) {

        // Wichtige Datentypen

        int number = 1;                         //Für Zahlen ohne Nachkommastellen
        double comma_number = 1.5;              //Für Zahlen mit Nachkommastellen
        String name = "Peter";                  //Für Wörter, Sätze etc (Aneinanderreihung von chars)
        char character = 'a';                   //Für einzelne Zeichen
        boolean wahrheitswert = false;           //Wahrheitswert für logische Auswertungen

        int variable = 1; // <-- Erstellung
        System.out.println("Die Variable 'variable' wird erstellt und mit "+variable+" belegt");

        variable = 2; // <-- Belegen wir nur den Wert

        System.out.println("Die Variable 'variable' wird mit "+variable+" belegt");

        // Wichtige Syntax zum vergleichen von Variablen
        // Diese Ausdrücke liefern einen boolean Wert, also true oder false!

        // Kleiner als:      variable1 < variable 2           -> True wenn variable1 kleiner als variable2
        // Größer als:       variable1 > variable 2           -> True wenn variable1 größer als variable2
        // Kleinergleich:    variable1 <= variable2           -> True wenn variable1 kleinergleich variable2
        // Größergleich:     variable1 >= variable 2          -> True wenn variable1 größergleich variable2
        // Gleichheit:       variable1 == variable2           -> True wenn variable1 gleich variable2
        // Ungleichheit:     variable1 != variable2           -> True wenn variable1 ungleich variable2

        // ACHTUNG! NICHT: variable1 = variable2 <-- Dies ist eine Deklaration. variable1 erhält den Wert von variable2

        boolean haus1IstRot = true;
        boolean haus2IstRot = false;
        // Logische Operatoren
        // Operator: !

        System.out.println("Haus1IstRot = "+haus1IstRot);
        System.out.println("Haus2IstRot = "+haus2IstRot);

        System.out.println("!haus1IstRot = "+!haus1IstRot);

        boolean testvariable = false;
        if(!testvariable == true)
        {
            // Dieser Fall tritt ein, wenn @testvariable = false;
        }

        // Operator: & / &&



        if(haus1IstRot && haus2IstRot)
        {
            // Ausdruck ist true, wenn beide Werte true sind.
            // Bei && wird vorzeitig false ausgegeben, wenn a false ist
            // Bei & müssen beide true sein.
        }

        System.out.println("(Haus1IstRot && Haus2IstRot) = "+(haus1IstRot&&haus2IstRot));

        // Operator: | / ||

        if(haus1IstRot || haus2IstRot)
        {
            // Ausdruck ist true, wenn beide Werte true sind.
            // Bei || wird vorzeitig true ausgegeben, wenn a true ist
            // Bei |
        }

        System.out.println("(Haus1IstRot || Haus2IstRot) = "+(haus1IstRot||haus2IstRot));

        // Operator: ^
        if(haus1IstRot^haus2IstRot)
        {
            // Dieser Ausdruck ist true, weil a und b unterschiedliche boolean Werte haben
        }

        System.out.println("(Haus1IstRot ^ Haus2IstRot) = "+(haus1IstRot^haus2IstRot));

        // While Schleife

        //while(logischer_ausdruck){
            // Irgendwas wird getan, während der in der while Schleife deklarierte logische Ausdruck == true ist.
       //}

        // Kombinieren wir mal was wir gelernt haben

        int number1 = 0;
        int counter = 0;

        System.out.println("Start der Whileschleife mit number1 = 10");

        while(counter < 10){
            counter++;
            System.out.println("Durchlauf "+counter+": [number1 = "+number1+"]");
            number1++;
        }

        // Die einzelnen Ausdrücke im Kopf der Whileschleife liefern jeweils true oder false. Am Ende wertet der logische
        // Operator das Endergebnis der Anweisung aus. while(anweisung1 && anweisung2) -> liefert true oder false
    }
}
