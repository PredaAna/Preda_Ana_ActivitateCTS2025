package seminar6.AdapterClase_Spital.main;


import seminar6.AdapterClase_Spital.clase.AdapterClaseMedicament;
import seminar6.AdapterClase_Spital.clase.Farmacie;
import seminar6.AdapterClase_Spital.clase.IMedicamentFarmacie;
import seminar6.AdapterClase_Spital.clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paduden", 45.99f, true);
        farmacie.vindeMedicament(medicamentFarmacie);

        //MedicamentSpital medicamentSpital = new MedicamentSpital("Aspenter", 37.3f);
        //AdapterClaseMedicament adapter = new AdapterClaseMedicament(medicamentSpital.getDenumire(),
        //        medicamentSpital.getPret());
        AdapterClaseMedicament adapter = new AdapterClaseMedicament( "Parasinus", 20);

        farmacie.vindeMedicament(adapter);
        adapter.achizitioneazaMedicament();
    }
}
