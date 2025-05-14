package ro.cts.decorator.clase;

public abstract class AbstractDecorator implements Nota{
    private Nota nota;

    public AbstractDecorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printare(){
        nota.printare();
        printareFelicitare();
    };
    abstract void printareFelicitare();

}
