package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade4 = idades[3];

        System.out.println(idade4);
        System.out.println(idades.length);

        //Array para testar um laço for:

        int[] testeFor = new int[5];

        for (int i = 0; i < testeFor.length; i++) {
            testeFor[i] = i * i;
        }

        for (int i = 0; i < testeFor.length; i++) {
            System.out.println(testeFor[i]);
        }

    }
}
