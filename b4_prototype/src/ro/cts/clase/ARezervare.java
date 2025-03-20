package ro.cts.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public abstract void descriere();

    public abstract ARezervare copiaza();

    public ARezervare(){
        this.numeClient = "necunoscut";
        this.nrPersoane = 5;
        this.data = "01.01.2020";
        this.ora = "18:30";
    }
    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if (numeClient.length()>3) {
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Necunoscut";
        }
        if(this.nrPersoane>2){
            this.nrPersoane = nrPersoane;
        }
        else{
            this.nrPersoane = 20;
        }
        if (data.length() == 8){
            this.data = data;
        }
        else{
            this.data="01.01.2020";
        }
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ARezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
