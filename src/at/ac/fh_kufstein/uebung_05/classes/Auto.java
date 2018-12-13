package at.ac.fh_kufstein.uebung_05.classes;

public class Auto extends Fahrzeug {
    private boolean klimaanlage;
    private short airbags;
    public Auto()
    {
        super();
    }
    public String toString()
    {
        return "Mein Auto hat "+getPs()+" PS und fährt mit 0 km/h";
    }

    public Auto(short reifen, String farbe, short ps, Short tueren, boolean gestartet, short geschwindigkeit, boolean klimaanlage, short airbags)
    {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
        this.klimaanlage = klimaanlage;
        this.airbags = airbags;
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }
    public void klimaanlageAn() {
        if(!isKlimaanlage()) {
            this.klimaanlage = true;
        }
        else
        {
            System.out.println("das klima läuft bereits");
        }
    }
    public void klimaanlageAus() {
        if(isKlimaanlage())
        {
            this.klimaanlage = false;
        }
        else
            {
                System.out.println("das klima is beriets aus");
            }
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}
