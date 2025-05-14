package ro.cts.spital.pb3.classes;

public class Medic extends Angajat{
    private double spor;

    public Medic(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
