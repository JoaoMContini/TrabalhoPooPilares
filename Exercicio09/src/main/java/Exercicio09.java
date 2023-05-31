/*
Crie uma classe abstrata "Instrumento" com método abstrato "tocar". 
Implemente as subclasses "Violão", "Piano" e "Bateria" que herdam de "Instrumento" e implementam o método abstrato de forma polimórfica.
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Instrumento a = new Violao();
        Instrumento b = new Piano();
        Instrumento c = new Bateria();
    
        a.tocar();
        b.tocar();
        c.tocar();
        
    }
}
