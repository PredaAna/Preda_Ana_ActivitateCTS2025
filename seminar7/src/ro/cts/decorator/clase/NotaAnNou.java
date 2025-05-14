package ro.cts.decorator.clase;

public class NotaAnNou extends AbstractDecorator{
    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("An nou fericit!");
    }
}
