public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("Exception " + message);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta conta = null;
            conta.deposita();
            //int a = i /0;

        }
        System.out.println("Fim do metodo2");
    }
}