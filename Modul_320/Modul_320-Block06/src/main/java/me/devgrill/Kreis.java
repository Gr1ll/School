package me.devgrill;

public class Kreis {
    //initialize Variable
    private double m_Durchmesser;

    public Kreis(double m_Durchmesser){
        //set variable
        this.m_Durchmesser = m_Durchmesser;
    }

    public Kreis(){
    //empty Kreis
    }

    public double getDurchmesser(){
        //return Durchmesser
        return this.m_Durchmesser;
    }

    public double getFlaeche(){
        // return calculated Flaeche as double
        double m_Flaeche = Math.pow(getRadius(), 2) * Math.PI;
        return m_Flaeche;
    }

    public double getRadius(){
        //return calculated Radius
        return (this.m_Durchmesser / 2);
    }

    public void setDurchmesser(double m_Durchmesser){
        //overwrite Durchmesser
        this.m_Durchmesser = m_Durchmesser;
    }

    public void setRadius(double m_Radius){
        //overwrite Radius / Durchmesser as Radius * 2
        this.m_Durchmesser = (m_Radius * 2);
    }
}
