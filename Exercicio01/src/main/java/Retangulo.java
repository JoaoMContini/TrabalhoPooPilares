public class Retangulo extends Shape{
    double lado;
    double altura;
    public void calcularÁrea(double pLado, double pAltura){
        double resultado = pLado * pAltura;
        System.out.println(resultado);
    }
    
    public void calcularPerímetro(double pLado, double pAltura){
        double resultado = (pLado * 2) + (pAltura * 2);
        System.out.println(resultado);
    }
}
