package ro.cts.composite.spital.main;

import ro.cts.composite.spital.classes.Departament;
import ro.cts.composite.spital.classes.Optiune;
import ro.cts.composite.spital.classes.Sectie;

public class Main {
    public static void main(String[] args) {
        Optiune DMedicinaInterna = new Departament("Medicină Internă");
        Optiune DNeonatologie = new Departament("Neonatologie");
        Optiune DLaboratorClinic = new Departament("Laborator Clinic");
        Optiune DImagistica = new Departament("Imagistică Medicală");


        Optiune SCard = new Sectie("Sectie de cardiologie");
        Optiune SChir = new Sectie("Sectie de chirurgie");
        Optiune SOrtopedie = new Sectie("Sectia de ortopedie");
        Optiune SPediatrie = new Sectie("Sectia de pediatrie");
        Optiune SNeurologie = new Sectie("Sectia de neurologie");
        Optiune SOftalmologie = new Sectie("Sectia de oftalmologie");
        Optiune SUrologie = new Sectie("Sectia de urologie");

        try {
            DMedicinaInterna.adaugaNod(SCard);
            DMedicinaInterna.adaugaNod(SChir);

            DMedicinaInterna.adaugaNod(DImagistica);
            DMedicinaInterna.adaugaNod(DNeonatologie);
            DMedicinaInterna.adaugaNod(DLaboratorClinic);

            DNeonatologie.adaugaNod(SPediatrie);
            DNeonatologie.adaugaNod(SOrtopedie);

            DImagistica.adaugaNod(SNeurologie);
            DImagistica.adaugaNod(SOftalmologie);

            DLaboratorClinic.adaugaNod(SUrologie);

            DNeonatologie.stergeNod(SPediatrie);

            DMedicinaInterna.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}