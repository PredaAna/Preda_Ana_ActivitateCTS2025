package singletonCurs.main;

import singletonCurs.clase.AgentieEager;
import singletonCurs.clase.AgentieLazy;

public class Main {
    public static void main(String[] args) {
        AgentieEager agentie1 = AgentieEager.getInstance("Agentie1", 1234, 4);
        System.out.println(agentie1.toString());

        agentie1.emiteFactura("Plata telefon");
        System.out.println(agentie1.toString());

        AgentieLazy agentie2 = AgentieLazy.getIstanta("Agentie2", 2345, 5);
        System.out.println(agentie2.toString());
    }
}
