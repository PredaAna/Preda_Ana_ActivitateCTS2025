package ro.cts.spital.pb1.v1.main;

import ro.cts.spital.pb1.v1.classes.Pacient;
import ro.cts.spital.pb1.v1.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Andrei");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Diana").setAreHalat(true).getPacient();

        System.out.println(pacient1.toString());

//        pacient1.setNumeInsotitor("Gigel");
//        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("insotitor2").setAreMicDejun(true).getPacient();
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}
