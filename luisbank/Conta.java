public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}