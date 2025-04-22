package vetores;

import estruturas.PilhaVetor;

public class EditorTexto {
    private String textoAtual;
    private PilhaVetor pilhaDesfazer;
    private PilhaVetor pilhaRefazer;

    public EditorTexto() {
        this.textoAtual = "";
        this.pilhaDesfazer = new PilhaVetor();
        this.pilhaRefazer = new PilhaVetor();
    }

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual); 
        textoAtual += novoTexto;
        pilhaRefazer = new PilhaVetor();
        System.out.println("Texto atual: " + textoAtual);
    }

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual); 
            textoAtual = (String) pilhaDesfazer.desempilhar(); 
            System.out.println("Desfeito. Texto atual: " + textoAtual);
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual);
            textoAtual = (String) pilhaRefazer.desempilhar(); 
            System.out.println("Refeito. Texto atual: " + textoAtual);
        } else {
            System.out.println("Nada para refazer.");
        }
    }
}
