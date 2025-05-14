package ro.cts.seminar4.prototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Ana",10,"20.03.2025", "18:53");

        ARezervare rezervare2 = rezervare.copiaza();
        ARezervare rezervare3 = rezervare.copiaza();

        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());
    }
}
