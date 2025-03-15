package SingletonRegistry;

// singleton registry contine un map

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance;

    public static AutoritatePescuit getInstance(String denumire, String website, int nrAngajati) {
        if(instance == null) {
            instance = new AutoritatePescuit(denumire, website, nrAngajati);
        }
        return instance;
    }

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    private Map<String, Autorizatie> registry = new HashMap<>();

    public Autorizatie emiteAutorizatie(String numePersoana) {
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(numePersoana, registry.size() + 1, (new Date()).toString()));
        }
        return registry.get(numePersoana);

    }
}
