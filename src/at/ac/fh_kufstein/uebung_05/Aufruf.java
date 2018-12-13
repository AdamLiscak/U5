package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.classes.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufruf {
    public static void main(String[] args) {
Auto bmw= new Auto( );
        bmw.setReifen((short) 4);
bmw.setFarbe("silber");
bmw.setTueren((short) 5);
bmw.setAirbags((short) 4);
bmw.setPs((short) 220);
        Auto audi= new Auto( );
        audi.setReifen((short) 4);
        audi.setFarbe("schwarz");
        audi.setTueren((short) 5);
        audi.setAirbags((short) 8);
        audi.setPs((short) 180);
Wasserfahrzeug titanic= new Wasserfahrzeug();
titanic.setReifen((short) 0);
titanic.setFarbe("blau");
titanic.setPs((short) 51000);
titanic.setTueren((short) 0);
titanic.setTiefgang(10.54);
titanic.setSchrauben((short) 3);
titanic.setLadung(100000);
        System.out.println(titanic.toString());
        ArrayList<Fahrzeug> l = new ArrayList<>(Arrays.asList(bmw,audi,titanic));
        for (Fahrzeug i:l)
        {
            System.out.println(i.toString());
        }

    }

}
