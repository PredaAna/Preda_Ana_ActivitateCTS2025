package ro.cts.composite.spital.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Optiune{
    List<Optiune> lista;
    String nume;

    public Departament(String nume) {
        lista = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Departamentul: " + nume);
        for(var o : lista)
            o.descriere();
    }
}
