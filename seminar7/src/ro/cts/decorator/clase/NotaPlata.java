package ro.cts.decorator.clase;

public class NotaPlata implements Nota{
    private float total;

    public NotaPlata(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public NotaPlata setTotal(float total) {
        this.total = total;
        return this;
    }

    @Override
    public void printare() {
        System.out.println("Total de plata "+total);
    }
}
