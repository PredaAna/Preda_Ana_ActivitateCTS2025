package simpleFactoryCurs.main;

import simpleFactoryCurs.classes.AgentieFactory;
import simpleFactoryCurs.classes.PachetTuristic;
import simpleFactoryCurs.classes.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        try {
            pachetTuristic = agentieFactory.crearePachet(TipPachet.pachetCazare);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        pachetTuristic.descriere();
    }
}
