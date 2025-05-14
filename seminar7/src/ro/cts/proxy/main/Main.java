package ro.cts.proxy.main;

import ro.cts.proxy.clase.IRezervare;
import ro.cts.proxy.clase.ProxyNumeClient;
import ro.cts.proxy.clase.ProxyRezervare;
import ro.cts.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare=new Rezervare();
        IRezervare proxyRezervare=new ProxyRezervare(rezervare);
        IRezervare proxyNume=new ProxyNumeClient(rezervare);
        proxyRezervare.realizeazaRezervare("Mihai", 2);
        proxyRezervare.realizeazaRezervare("Radu", 4);
        proxyNume.realizeazaRezervare("Mihai", 2);
        proxyNume.realizeazaRezervare("Radu", 4);
    }
}
