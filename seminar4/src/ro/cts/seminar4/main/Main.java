package ro.cts.seminar4.main;

import ro.cts.seminar4.clase.Supa;
import ro.cts.seminar4.factory.Factory;
import ro.cts.seminar4.factory.TipuriSupe;

public class Main {
    public static void main ( String[] args){
        Factory factory = new Factory(200, 10);
        Supa supa = factory.getSupa(TipuriSupe.LEGUME, "Bors, legume", 100);
        supa.preparareSupa();
        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Vita, bors", 150);
        supaVita.preparareSupa();
        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Ciuperci, bors", 110);
        supaCiuperci.preparareSupa();
    }
}
