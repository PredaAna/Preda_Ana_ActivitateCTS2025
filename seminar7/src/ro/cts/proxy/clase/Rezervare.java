package ro.cts.proxy.clase;

public class Rezervare implements IRezervare{
    public Rezervare() {
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizata pentru "+numeClient+", masa de "+numarPersoane+" persoane");

    }
}
