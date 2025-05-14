package prototypeCurs.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

    private List<String> oferte;

    public ListaOferte(){
        oferte = new ArrayList<String>();
    }

    public void setOferte(List<String> oferte){
        this.oferte = oferte;
    }
    @Override
    public IListaOferte copiaza() {
        ListaOferte listaOferte = new ListaOferte();
        List<String> listaTemporara = new ArrayList<String>();
        for (String oferta:this.oferte){
            listaTemporara.add(oferta);
        }
        listaOferte.setOferte(listaTemporara);
        return listaOferte;
    }

    @Override
    public void incarcaListaOferte() {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("oferte"));
            String oferta = null;
            while ((oferta = reader.readLine())!=null){
                oferte.add(oferta);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Lista oferte [oferte="+oferte+"]";
    }
}
