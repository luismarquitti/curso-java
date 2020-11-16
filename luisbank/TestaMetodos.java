public class TestaMetodos {
    public static void main(String[] args) {
        Conta contaLuis = new Conta();
        Conta contaEluma = new Conta();

        System.out.println(contaLuis.saldo);
        System.out.println(contaEluma.saldo);

        contaLuis.deposita(500);
        contaEluma.deposita(500);

        System.out.println(contaLuis.saldo);
        System.out.println(contaEluma.saldo);

        contaLuis.saca(100);

        System.out.println(contaLuis.saldo);
        System.out.println(contaEluma.saldo);

        contaEluma.transfere(50, contaLuis);

        System.out.println(contaLuis.saldo);
        System.out.println(contaEluma.saldo);
    }
    
}
