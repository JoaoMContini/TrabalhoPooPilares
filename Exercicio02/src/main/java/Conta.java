public class Conta {
    private double saldo;
    private String titular;
    
    
    public void depositar(double pSaldo){
        setSaldo(pSaldo);
    }
    
    public void sacar(double pSaldo){
        saldo = saldo - pSaldo;
    }
    
    public void obterSaldo(){
        getSaldo();
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
