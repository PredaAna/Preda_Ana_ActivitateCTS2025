package ro.cts.seminar4.sfactory.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
        this.ingrediente = ingrediente;
    }

    public int getGramaj() {
        return gramaj;
    }

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public abstract void preparareSupa();
    public double calculPret(){
        return pretPerSutaGr*(gramaj/100);
    }
}
