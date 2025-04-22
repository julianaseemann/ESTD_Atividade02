package estruturas;

public class No {
    public Object elemento;
    public No proximo;
    public No anterior;

    public No(Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }
}
