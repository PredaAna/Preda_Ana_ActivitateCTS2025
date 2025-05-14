package main;

import clase.AutoritatePescuitEager;
import clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebSite("ANpPA.ro");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Popescu Paul");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Preda Ana");
        System.out.println(autoritatePescuitEager2.toString());

        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ANPA", "anpa.ro", 10, 150);
        System.out.println(autoritatePescuitLazy);

        AutoritatePescuitLazy autoritatePescuitLazy2 = AutoritatePescuitLazy.getInstance("paul", "paul.ro", 10, 150);
        autoritatePescuitLazy2.emiteAutorizatie("Ionescu Marcel");
        System.out.println(autoritatePescuitLazy);
    }
}