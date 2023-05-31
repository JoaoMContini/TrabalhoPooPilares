public class Programador extends Funcionario{
    private String linguagem;

    public Programador(String linguagem, double salario) {
        super(salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    
    
}
