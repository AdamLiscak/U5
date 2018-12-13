package at.ac.fh_kufstein.uebung_05.classes;

public class Wasserfahrzeug extends Fahrzeug {
    private double tiefgang;
    private short schrauben;

    public Wasserfahrzeug(short reifen, String farbe, short ps, Short tueren, boolean gestartet, short geschwindigkeit, double tiefgang, short schrauben, double ladung) {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
    }
    public String toString()
    {
        return "Mein Wasserfahrzeug hat "+getPs()+" PS und einen Tiefengang von "+getTiefgang();
    }
    public Wasserfahrzeug(){ super (); }

    private double ladung;

    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung(){

        return ladung;
    }

    public void setLadung(double ladung)
    {
        this.ladung = ladung;
    }
    public void entladen ()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        setLadung(0);
    }
}
