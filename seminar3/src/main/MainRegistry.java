package main;

import SingletonRegistry.AutoritatePescuit;
import SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance("ANPA", "anpa.ro", 100);
        Autorizatie autorizatieGeorgeCosbuc = autoritatePescuit.emiteAutorizatie("George Cosbuc");
        System.out.println(autorizatieGeorgeCosbuc);
        Autorizatie autorizatieGeorgeCosbuc2 = autoritatePescuit.emiteAutorizatie("George Cosbuc");
        System.out.println(autorizatieGeorgeCosbuc);
    }
}
