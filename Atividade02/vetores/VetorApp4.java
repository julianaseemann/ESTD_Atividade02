//Rodar o código:
//javac -d . vetores/*.java estruturas/*.java
//java VetorApp4

package vetores;

import estruturas.Documento;
import estruturas.Fila;

public class VetorApp4 {
    public static void main(String[] args) {
        Fila filaImpressao = new Fila();

        filaImpressao.enfilerar(new Documento("Atividade02.pdf", 250));
        filaImpressao.enfilerar(new Documento("ContratoUniville.docx", 120));
        filaImpressao.enfilerar(new Documento("ImagemPerfil.png", 500));

        System.out.println("Fila de impressão:");
        filaImpressao.mostrarFila();

        System.out.println("Imprimindo documentos:");
        while (!filaImpressao.estaVazia()) {
            Documento doc = (Documento) filaImpressao.desenfileirar();
            System.out.println("Imprimindo -> " + doc);
        }

        System.out.println("Fila vazia? " + filaImpressao.estaVazia());
    }
}
