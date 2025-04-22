// Rodar o código:
//javac -d . vetores/*.java vetores/estruturas/*.java
//java vetores.VetorApp3

//package vetores;

import estruturas.Fila;

public class VetorApp3 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("A fila está vazia? " + fila.estaVazia());

        fila.enfilerar(10);
        fila.enfilerar(20);
        fila.enfilerar(30);

        System.out.println("Elementos enfileirados:");
        fila.mostrarFila();

        System.out.println("Fila está vazia? " + fila.estaVazia());

        System.out.println("Elemento removido da fila: " + fila.desenfileirar());
        fila.mostrarFila();

        System.out.println("Elemento removido da fila: " + fila.desenfileirar());
        fila.mostrarFila();

        System.out.println("Elemento removido da fila: " + fila.desenfileirar());
        fila.mostrarFila();

        System.out.println("Fila está vazia agora? " + fila.estaVazia());

        try {
            fila.desenfileirar();
        } catch (IllegalStateException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
