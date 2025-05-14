package singletonCurs.clase;

public class AgentieLazy {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;
    private int nrFacturi;

    private AgentieLazy() {
        this.numeAgentie = "Agentia Y";
        this.capital = 20100;
        this.nrAngajati = 20;
        this.nrFacturi = 20;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public int getNrFacturi() {
        return nrFacturi;
    }

    public void setNrFacturi(int nrFacturi) {
        this.nrFacturi = nrFacturi;
    }

    private static AgentieLazy instance = null;

    public static synchronized AgentieLazy getIstanta(String nume, float capital, int nrAngajati)  //pentru a face singleton lazy thread safe doar am adaugat acel syncronized
    {
        if (instance == null)
        {
            instance = new AgentieLazy();
            instance.setNumeAgentie(nume);
            instance.setCapital(capital);
            instance.setNrAngajati(nrAngajati);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieLazy{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrFacturi=").append(nrFacturi);
        sb.append('}');
        return sb.toString();
    }
}
