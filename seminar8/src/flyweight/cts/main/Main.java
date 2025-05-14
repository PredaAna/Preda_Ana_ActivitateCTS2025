package flyweight.cts.main;

import flyweight.cts.classes.Pacient;
import flyweight.cts.classes.PacientAbstract;
import flyweight.cts.classes.Receptie;
import flyweight.cts.classes.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();

        receptie.getPacient("Ion", "1234", "bucuresti");
        receptie.getPacient("Andreea", "1234", "brasov");
        receptie.getPacient("Maria", "1234", "sibiu");

        Spitalizare s1 = new Spitalizare(1, 12, 3);
        Spitalizare s2 = new Spitalizare(1, 13, 5);
        Spitalizare s3 = new Spitalizare(1, 16, 2);
        Spitalizare s4 = new Spitalizare(1, 10, 3);

        try {
            receptie.getPacient("Ion").afisareInformatii(s2);
            receptie.getPacient("Andreea").afisareInformatii(s4);
            receptie.getPacient("Maria").afisareInformatii(s1);
            receptie.getPacient("Ion").afisareInformatii(s3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//command, memento, state nu intra la lucrare