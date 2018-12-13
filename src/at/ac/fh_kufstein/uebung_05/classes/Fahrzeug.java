package at.ac.fh_kufstein.uebung_05.classes;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private Short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    private static int anzahl=0;

    public Fahrzeug(short reifen, String farbe, short ps, Short tueren, boolean gestartet, short geschwindigkeit)
    {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
        anzahl++;

    }
    public Fahrzeug()
    {
      anzahl++;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }
    public Short getTueren() {
        return tueren;
    }

    public void setTueren(Short tueren) {
        this.tueren = tueren;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }



    public boolean isGestartet() {
        return gestartet;
    }


    public void starten()
    {
        this.gestartet = true;
    }
    public void stoppen()
    {
        this.gestartet=false;
    }
    public static int getAnzahl() {
        return anzahl;
    }
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }
    public void beschleunigen(short geschwindigkeit)
    {
        if(isGestartet())
        {
            if (this.geschwindigkeit + geschwindigkeit < 250) {
                this.geschwindigkeit += geschwindigkeit;
            } else
                {
                setGeschwindigkeit((short) 250);
            }
        }

    }

    public void setGestartet(boolean gestartet)
    {
        this.gestartet = gestartet;
    }

    public void bremsen(short geschwindigkeit)
    {
        if(isGestartet())
        {
            if (this.geschwindigkeit - geschwindigkeit > 0) {
                this.geschwindigkeit -= geschwindigkeit;
            }
            else {
                setGeschwindigkeit((short) 0);
            }
        }
    }
}
