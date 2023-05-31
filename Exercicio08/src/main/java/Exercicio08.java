/*
Implemente uma interface "Autenticável" com métodos "autenticar" e "desautenticar". 
Crie a classe "SistemaSeguro" que implementa a interface de forma polimórfica e utilize o encapsulamento para proteger os dados sensíveis.
 */
public class Exercicio08 {

    public static void main(String[] args) {
       Autenticavel a = new SistemaSeguro();
       a.autenticar();
       a.desautenticar();
    }
}
