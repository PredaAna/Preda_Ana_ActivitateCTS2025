package ro.cts.spital.pb3.factories;

import ro.cts.spital.pb3.classes.Angajat;
import ro.cts.spital.pb3.classes.Asistent;
import ro.cts.spital.pb3.classes.Medic;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        if (tipPersonal instanceof TipPersonalMedical) {
            TipPersonalMedical medical = (TipPersonalMedical) tipPersonal;
            switch (medical) {
                case ASISTENT: return new Asistent(nume, salariu, spor);
                case MEDIC: return new Medic(nume, salariu, spor);
                default: return null;
            }
        }
        return null;
    }
}
