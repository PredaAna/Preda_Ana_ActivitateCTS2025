package ro.cts.seminar4.clase;

public class SupaVita extends Supa{
    private double pretExtra;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita comandata cu smantana cu pretul de "+pretExtra+" ese gata");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+pretExtra;
    }
}
