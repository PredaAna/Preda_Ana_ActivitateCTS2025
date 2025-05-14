package flyweight.cts.classes;

public class Pacient implements PacientAbstract{
    private String nume;
    private String numarTel;
    private String adresa;

    public Pacient(String nume, String numarTel, String adresa) {
        this.nume = nume;
        this.numarTel = numarTel;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTel() {
        return numarTel;
    }

    public void setNumarTel(String numarTel) {
        this.numarTel = numarTel;
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
        sb.append(", numarTel='").append(numarTel).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareInformatii(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println("Acesta a fost internat la: ");
        System.out.println(spitalizare.toString());
    }
}
