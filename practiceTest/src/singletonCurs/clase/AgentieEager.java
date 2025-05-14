package singletonCurs.clase;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;
    private int nrFacturi;

    private AgentieEager()  //constructorul PRIVAT
    {
        this.numeAgentie = "Agentia X";
        this.capital = 10100;
        this.nrAngajati = 10;
        this.nrFacturi = 10;
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

    private static final AgentieEager instanta = new AgentieEager();

    public static AgentieEager getInstance(String nume, float capital, int nrAngajati)
    {
        instanta.setNumeAgentie(nume);
        instanta.setCapital(capital);
        instanta.setNrAngajati(nrAngajati);
        return instanta;
    }

    public void emiteFactura(String factura)
    {
        System.out.println(new StringBuilder("A fost primita factura ").append(factura).toString());
        nrFacturi++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEager{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrFacturi=").append(nrFacturi);
        sb.append('}');
        return sb.toString();
    }
}
