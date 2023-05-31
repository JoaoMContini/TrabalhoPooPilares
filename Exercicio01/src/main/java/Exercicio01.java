/*
Crie uma classe abstrata "Shape" com métodos abstratos "calcularÁrea" e "calcularPerímetro". 
Implemente as subclasses "Círculo", "Retângulo" e "Triângulo" que herdam de "Shape" e implementam os métodos abstratos de forma polimórfica.
*/

public class Exercicio01 {

    public static void main(String[] args) {
        Shape a1 = new Shape();
        a1.calcularÁrea();
        a1.calcularPerímetro();
        
        Shape a2 = new Retangulo();
        a2.calcularÁrea();
        a2.calcularPerímetro();
        
        Shape a3 = new Circulo();
        a3.calcularÁrea();
        a3.calcularPerímetro();
        
        Shape a4 = new Triangulo();
        a4.calcularÁrea();
        a4.calcularPerímetro();
    }
}
