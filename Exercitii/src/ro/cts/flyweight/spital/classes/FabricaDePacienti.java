package ro.cts.flyweight.spital.classes;

import java.util.HashMap;

public class FabricaDePacienti {
    private HashMap<String, IPacient> pachetPacienti;

    public FabricaDePacienti()
    {
        pachetPacienti = new HashMap<String, IPacient>();
    }

    public int getNrPachete() { return pachetPacienti.size();}

    public IPacient getPachetPacient(String numeP){
        IPacient pacient = pachetPacienti.get(numeP);
        if (pacient == null){
            pacient = new Pacient("Ana", 629128323, "Bucuresti");
            pachetPacienti.put(numeP, pacient);
        }
        return pacient;
    }
}
