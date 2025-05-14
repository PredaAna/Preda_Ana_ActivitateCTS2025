package flyweight.cts.classes;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, PacientAbstract> pacienti;

    public Receptie() {
        pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nume, String nrTel, String adresa)
    {
        if(!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, nrTel, adresa));
        }
        return this.pacienti.get(nume);

    }

    public PacientAbstract getPacient(String nume) throws Exception {
        if(this.pacienti.containsKey(nume)) {
            return pacienti.get(nume);
        } else {
            throw new Exception("Exceptie");
        }


    }
}
/*
public PacientAbstract getPacient(String cnp) throws Exception {
    if(this.pacienti.containsKey(cnp)) {
        return this.pacienti.get(cnp);
    } else {
        throw new Exception("Pacientul cu CNP-ul " + cnp + " nu exista!");
    }
}*/
