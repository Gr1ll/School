package me.devgrill;

public class Main {
    public static void main(String[] args) {
        Kegelstumpf f1 = new Kegelstumpf(12, 5.3, 7.5);
        System.out.println("Oberflaeche= " + f1.getOberflaeche());
        System.out.println("Mantelflaeche= " + f1.getMatelflaeche());
        System.out.println("Mantellinie= "+ f1.getMantellinie());
        System.out.println("Volumen= " + f1.getVolumen());
        System.out.println("\n");
        Kegelstumpf f2 = new Kegelstumpf(new Kreis(12), new Kreis(5.3), 7.5);
        System.out.println("Oberflaeche= " + f2.getOberflaeche());
        System.out.println("Mantelflaeche= " + f2.getMatelflaeche());
        System.out.println("Mantellinie= " + f2.getMantellinie());
        System.out.println("Volumen= " + f2.getVolumen());
    }
}