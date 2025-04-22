package estruturas;

public class Fila {
    private No inicio;
    private No fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void enfilerar(Object elemento) {
        No novoNo = new No(elemento);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("Fila está vazia");
        }
        Object elemento = inicio.elemento;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return elemento;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    
    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
    
        No atual = inicio;
        System.out.print("Fila atual: ");
        while (atual != null) {
            System.out.print(atual.elemento);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
