package ro.cts.facade.clase;

public class Facade {
    public String verificaAsezareMasa(Masa masa){
        Picolo picolo=new Picolo();
        Ospatar ospatar=new Ospatar();
        if(masa.isEsteLibera()){
            if(picolo.debaraseaza(masa)){
                if(ospatar.esteAranjata(masa)){
                    return "Luati loc va rog la masa "+masa.getNrMasa();
                }
                else {
                    return "Asteptati pt aranjarea mesei";
                }
            } else {
                return "Astepta-ti tocmai s-a ridicat cineva";
            }
        } else {
            return "Nu avem locuri disponibile";
        }
    }
}
