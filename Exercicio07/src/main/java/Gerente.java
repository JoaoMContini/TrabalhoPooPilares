public class Gerente extends Funcionario{
    private String nome;


    public Gerente(double pSalario, String pNome) {
        super(pSalario);
        this.nome = pNome;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
