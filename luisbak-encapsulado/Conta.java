public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

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

    // Para o saldo, não faz sentido usar o setSaldo, pois os métodos saca e deposita já fazem a sua função.
    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return this.titular;
    }

}