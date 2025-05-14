package flyweight.cts.classes;

public class Spitalizare {
    private int numar_salon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Spitalizare(int numar_salon, int numarPat, int numarZileSpitalizare) {
        this.numar_salon = numar_salon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("numar_salon=").append(numar_salon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
