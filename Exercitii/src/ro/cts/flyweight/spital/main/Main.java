package ro.cts.flyweight.spital.main;

import ro.cts.flyweight.spital.classes.FabricaDePacienti;
import ro.cts.flyweight.spital.classes.Optionale;
import ro.cts.flyweight.spital.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        FabricaDePacienti fabricaDePacienti = new FabricaDePacienti();
        Optionale optionale1 = new Optionale("dermatologie", 0);
        Optionale optionale2 = new Optionale("Operatie stomac", 7);
        Optionale optionale3 = new Optionale("covid", 14);

        Pacient p1 = new Pacient("AnaMaria", 45747238, "Cluj");

        Pacient pachet = (Pacient) fabricaDePacienti.getPachetPacient("AnaMaria");
        pachet.descrierePacient(optionale1);
    }
}
