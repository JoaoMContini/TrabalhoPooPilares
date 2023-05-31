/*
Implemente uma classe abstrata "Animal" com métodos abstratos "emitirSom" e "mover". 
Crie as subclasses "Cachorro", "Gato" e "Passarinho" que herdam de "Animal" e implementam os métodos abstratos de forma polimórfica.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.emitirSom();
        a1.mover();
        
        Animal a2 = new Cachorro();
        a2.emitirSom();
        a2.mover();
        
        Animal a3 = new Gato();
        a3.emitirSom();
        a3.mover();
        
        Animal a4 = new Passarinho();
        a4.emitirSom();
        a4.mover();
        
    }
}
