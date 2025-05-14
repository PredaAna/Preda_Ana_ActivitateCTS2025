package ro.cts.spital.pb3.factories;

import ro.cts.spital.pb3.classes.Angajat;

public interface FactoryPersonal {

    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
