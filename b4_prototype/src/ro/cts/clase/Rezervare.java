package ro.cts.clase;

public class Rezervare extends ARezervare{
    @Override
    public void descriere() {
        System.out.println("Aceasta e o rezervare");
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;
        return rezervareNoua;
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    public Rezervare(){
       super();
    }
}
