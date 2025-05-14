package ro.cts.spital.pb3.classes;

public class Asistent extends Angajat{
    private double spor;
    public Asistent(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
