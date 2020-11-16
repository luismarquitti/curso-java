public class TestaWhile {

    public static void main(String[] args) {

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            // pode ser usado contador += 1 ou contador++ para incrementar o valor de contador.
            contador = contador + 1;
        }

    }
}