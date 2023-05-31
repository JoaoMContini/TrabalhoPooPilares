public class Livro extends Produto{
   public String autor;

    public Livro(String pAutor, String pNome, double pValor) {
        super(pNome, pValor);
        this.autor = pAutor;
    }
   
   
}
