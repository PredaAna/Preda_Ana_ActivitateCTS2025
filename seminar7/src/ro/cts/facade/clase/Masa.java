package ro.cts.facade.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;

    public Masa(int nrMasa, boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public Masa setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
        return this;
    }

    public Masa setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", esteLibera=").append(esteLibera);
        sb.append('}');
        return sb.toString();
    }
}
