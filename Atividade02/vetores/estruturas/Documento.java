package estruturas;


public class Documento {
    private String nome;
    private int tamanho;

    public Documento(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Documento: " + nome + " (" + tamanho + "KB)";
    }
}
