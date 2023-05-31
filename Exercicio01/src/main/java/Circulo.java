public class Circulo extends Shape{
    double pi;
    double raio;
    public void calcularÁrea(double pPi, double pRaio){
        double resultado = (pRaio * pRaio) * pi;
        System.out.println(resultado);
    }
    
    public void calcularPerímetro(double pPi, double pRaio){
        double resultado = (2 * pi) * pRaio;
        System.out.println(resultado);

    }
}
