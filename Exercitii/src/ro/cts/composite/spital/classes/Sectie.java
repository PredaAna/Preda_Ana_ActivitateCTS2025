package ro.cts.composite.spital.classes;

public class Sectie implements Optiune{
    String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("    Sectia: "+nume);
    }
}
