package me.devgrill;

public class Kegelstumpf {
    //initializing variables
    private Kreis m_Deckkreis = null;
    private Kreis m_Grundkreis = null;
    private double m_Hoehe;
    public Kegelstumpf(Kreis m_Deckkreis, Kreis m_Grundkreis, double m_Hoehe){
        //setting variables
        this.m_Deckkreis = m_Deckkreis;
        this.m_Grundkreis = m_Grundkreis;
        this.m_Hoehe = m_Hoehe;
    }

    public Kegelstumpf(double m_Deckkreis, double m_Grundkreis, double m_Hoehe){
        //setting variables
        this.m_Deckkreis = new Kreis(m_Deckkreis);
        this.m_Grundkreis = new Kreis(m_Grundkreis);
        this.m_Hoehe = m_Hoehe;
    }

    public double getMantellinie(){
        //return calculated Mantellinie
        return Math.sqrt(Math.pow(m_Grundkreis.getRadius() - m_Deckkreis.getRadius(), 2) + m_Hoehe);
    }

    public double getMatelflaeche(){
        //return calculated mantelflaeche
        return ((m_Grundkreis.getRadius() + m_Deckkreis.getRadius()) * Math.PI * getMantellinie());
    }

    public double getOberflaeche(){
        //return calculated Oberflaeche
        return (Math.PI * Math.pow(m_Deckkreis.getRadius(), 2));
    }

    public double getVolumen(){
        //return calculated Valume
        return (((this.m_Hoehe * Math.PI)/3) * (Math.pow(m_Grundkreis.getRadius(), 2) + m_Grundkreis.getRadius() * m_Deckkreis.getRadius() + Math.pow(m_Deckkreis.getRadius(), 2)));
    }

    public void setHoehe(double m_Hoehe){
        //overwrite hoehe variable
        this.m_Hoehe = m_Hoehe;
    }
}
