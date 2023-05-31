/*
Crie uma interface "Veiculo" com métodos "acelerar" e "frear". 
Implemente as classes "Carro", "Moto" e "Caminhão" que implementam a interface de forma polimórfica. 
Utilize herança para compartilhar atributos e métodos comuns entre as classes.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.acelerar();
        v1.freiar();
        
        Veiculo v2 = new Carro();
        v2.acelerar();
        v2.freiar();
        
        Veiculo v3 = new Moto();
        v3.acelerar();
        v3.freiar();
        
        Veiculo v4 = new Caminhao();
        v4.acelerar();
        v4.freiar();
        
        
    }
}
