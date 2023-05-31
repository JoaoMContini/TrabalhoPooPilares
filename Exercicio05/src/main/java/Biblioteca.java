import java.util.*;
public class Biblioteca {
    private Map<String, Livro> livros;
    
    
    public void addLivro(Livro pLivro) {
        livros.put(pLivro.getTitulo(), pLivro);
    }

    public void buscarLivros(String pAutor) {
        for (Livro livro : livros.values()) {
            if (livro.getAutor().equals(pAutor)) {
                System.out.println(livro);
            }else{
                System.out.println("Não foi encontrado nenhum livro com este autor");
            }
        }
    }

    public void exibirTodosLivros() {
        for (Livro livro : livros.values()) {
            System.out.println(livro);
        }
    }
}
