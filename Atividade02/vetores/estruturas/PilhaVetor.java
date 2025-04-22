package estruturas;

public class PilhaVetor {
    private Object[] elementos;
    private int topo;

    public PilhaVetor() {
        this.elementos = new Object[100];
        this.topo = -1;
    }

    public void empilhar(Object elemento) {
        if (topo < elementos.length - 1) {
            elementos[++topo] = elemento;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public Object desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return elementos[topo--];
    }

    public Object topo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}
