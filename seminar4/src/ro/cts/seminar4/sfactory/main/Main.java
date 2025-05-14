package ro.cts.seminar4.sfactory.main;

import ro.cts.seminar4.sfactory.clase.Supa;
import ro.cts.seminar4.sfactory.factory.Factory;
import ro.cts.seminar4.sfactory.factory.TipuriSupe;
import ro.cts.seminar4.prototype.ARezervare;
import ro.cts.seminar4.prototype.Rezervare;

public class Main {
    public static void main ( String[] args){
        Factory factory = new Factory(200, 10);
        Supa supa = factory.getSupa(TipuriSupe.LEGUME, "Bors, legume", 100);
        supa.preparareSupa();
        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Vita, bors", 150);
        supaVita.preparareSupa();
        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Ciuperci, bors", 110);
        supaCiuperci.preparareSupa();

        //prototype
        ARezervare rezervare=new Rezervare("Mihai", 10, "21.10.25", "14:00");
        ARezervare rezervare1=rezervare.copiaza();
        ARezervare rezervare2=rezervare.copiaza();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
