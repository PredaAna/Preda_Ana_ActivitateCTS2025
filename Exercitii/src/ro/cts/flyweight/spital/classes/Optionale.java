package ro.cts.flyweight.spital.classes;

public class Optionale {
    private String programare;
    private int nrZileSpitalizare;

    public Optionale(String programare, int nrZileSpitalizare) {
        super();
        this.programare = programare;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public String getProgramare() {
        return programare;
    }

    public void setProgramare(String programare) {
        this.programare = programare;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }
}
