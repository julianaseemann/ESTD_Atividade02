// Rodar código: 
//javac -d . vetores/*.java vetores/estruturas/*.java vetores/modelo/*.java
// java vetores.VetorApp

//package vetores;
import estruturas.PilhaVetor;

public class VetorApp {
    public static void main(String[] args) {

        //Exercício 1 - implementar a estrutura de pilha com vetor
        PilhaVetor pilha = new PilhaVetor();

        System.out.println("Pilha está vazia? " + pilha.estaVazia()); //Chama o método

        //empilhar os elementos
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);

        System.out.println("Elemento no topo: " + pilha.topo());
        System.out.println("Desempilhado: " + pilha.desempilhar());
        System.out.println("Desempilhado: " + pilha.desempilhar());

        System.out.println("Pilha está vazia? " + pilha.estaVazia());
    } 
}