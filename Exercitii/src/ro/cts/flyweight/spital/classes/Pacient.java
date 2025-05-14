package ro.cts.flyweight.spital.classes;

public class Pacient implements IPacient{
    private String nume;
    private int cnp;
    private String adresa;

    public Pacient(String nume, int cnp, String adresa) {
        super();
        this.nume = nume;
        this.cnp = cnp;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrierePacient(Optionale optionale) {
        System.out.println("Pacientul "+nume+
                ", din orasul " +adresa+
                " cu cnp-ul: "+cnp+
                " si are programare "+optionale.getProgramare()+" si "+ optionale.getNrZileSpitalizare() + " zile de spitalizare") ;
    }
}
