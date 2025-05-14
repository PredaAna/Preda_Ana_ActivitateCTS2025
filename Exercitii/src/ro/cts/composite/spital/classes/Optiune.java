package ro.cts.composite.spital.classes;

public interface Optiune {
    void adaugaNod(Optiune optiune) throws Exception;
    void stergeNod(Optiune optiune) throws Exception;
    Optiune getNod(int index) throws Exception;
    void descriere();
}
