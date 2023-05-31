public class Triangulo extends Shape{
    double ladoA;
    double ladoB;
    double ladoC;
    
    public void calcularÁrea(double pLadoA, double pLadoB, double pLadoC){
        double resultado = pLadoA + pLadoB + pLadoC;
        System.out.println(resultado);
    }
    
    public void calcularPerímetro(double pLadoA, double pLadoB, double pLadoC){
        double resultado = (pLadoA * pLadoB) / pLadoC;
        System.out.println(resultado);
    }
}
