package ro.cts.decorator.clase;

public class NotaPaste extends AbstractDecorator{
    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Paste fericit");
    }
}
