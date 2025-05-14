package ro.cts.facade.main;

import ro.cts.facade.clase.Facade;
import ro.cts.facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa =new Masa(4,true);
        Facade facade=new Facade();
        System.out.println(facade.verificaAsezareMasa(masa));

        Masa masa1=new Masa(3, true);
        System.out.println(facade.verificaAsezareMasa(masa1));
        Masa masa2=new Masa(5, false);
        System.out.println(facade.verificaAsezareMasa(masa2));
    }
}
