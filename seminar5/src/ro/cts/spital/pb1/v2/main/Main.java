package ro.cts.spital.pb1.v2.main;

import ro.cts.spital.pb1.v2.classes.Pacient;
import ro.cts.spital.pb1.v2.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Andreea").setAreHalat(true).setArePapuciDeCamera(true);

        Pacient pacient1 = pacientBuilder.build("Alex");
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Adrian").build("Diana");
        System.out.println(pacient2.toString());

        Pacient pacient3 = pacientBuilder.setNumeInsotitor("Maria").build("Petru");
        System.out.println(pacient3.toString());
    }
}
