// Rodar o código:
//javac -d . vetores/*.java vetores/estruturas/*.java
//java VetorApp2

//package vetores;
import vetores.EditorTexto;

public class VetorApp2 {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.inserirTexto("Bom ");
        editor.inserirTexto("- Dia");
        editor.desfazer();
        editor.refazer();
        editor.inserirTexto(" Todos!!");
        editor.desfazer();
        editor.desfazer();
    }
}
