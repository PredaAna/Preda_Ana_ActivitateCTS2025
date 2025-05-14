package ro.cts.proxy.clase;

public class ProxyNumeClient implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        if(numeClient.length()>5){
            this.rezervare.realizeazaRezervare(numeClient, numarPersoane);
        }else {
            System.out.println("Nu se poate realiza rezervarea");
        }
    }
}
