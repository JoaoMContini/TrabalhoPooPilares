public class SistemaSeguro implements Autenticavel{
    private String nome = "João";
    @Override
    public void autenticar() {
        System.out.println("Você está autenticado " + this.getNome());
        
    }

    @Override
    public void desautenticar() {
        System.out.println("Você não tem mais autenticação");
    }

    public String getNome() {
        return nome;
    }
    
}
