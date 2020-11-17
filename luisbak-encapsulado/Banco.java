public class Banco {
    public static void main(String[] args) {
        Conta contaLuis = new Conta();
        Cliente luisMarquitti = new Cliente();
        Endereço endereçoLuis = new Endereço();

        contaLuis.setTitular(luisMarquitti);
        luisMarquitti.setEndereço(endereçoLuis);

        contaLuis.getTitular().setNome("Luis Marquitti");

        System.out.println(contaLuis.getTitular().getNome());



    }
    
}
