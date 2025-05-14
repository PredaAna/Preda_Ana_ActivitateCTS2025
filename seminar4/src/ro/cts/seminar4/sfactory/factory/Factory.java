package ro.cts.seminar4.sfactory.factory;

import ro.cts.seminar4.sfactory.clase.Supa;
import ro.cts.seminar4.sfactory.clase.SupaLegume;
import ro.cts.seminar4.sfactory.clase.SupaCiuperci;
import ro.cts.seminar4.sfactory.clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaDeGr;

    public Factory(int gramaj, double pretPerSutaDeGr) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGr = pretPerSutaDeGr;
    }

    public Supa getSupa(TipuriSupe supe, String ingrediente, double extraSupa){
        switch (supe){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaDeGr, ingrediente, extraSupa );
                return supaLegume;
            case VITA:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaDeGr, ingrediente, extraSupa );
                return supaVita;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSutaDeGr, ingrediente, extraSupa );
                return supaCiuperci;
            default: return null;
        }
    }
}
