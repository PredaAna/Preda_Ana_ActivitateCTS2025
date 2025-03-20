package ro.cts.seminar4.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cant de ciuperci " +cantitateCiuperci+ " este gata.");
    }

    @Override
    public double calculPret() {
        return super.calculPret() + (cantitateCiuperci*getPretPerSutaGr()/100);
    }


}
