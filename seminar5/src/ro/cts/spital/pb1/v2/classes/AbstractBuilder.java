package ro.cts.spital.pb1.v2.classes;

import ro.cts.spital.pb1.v2.classes.Pacient;

public interface AbstractBuilder {
    Pacient build(String numePacient);
}
