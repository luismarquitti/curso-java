package br.com.bytebank.banco.test;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Luis Eduardo"; //object literal
        String outro = new String("Alura"); //má prática, sempre prefira a sintaxe literal

        //String novo = outro.replace("A", "a");

        //String novo = nome.toLowerCase(); //também teste toUpperCase()
        //String novo = nome.toUpperCase(); //também teste toUpperCase()


        //System.out.println(novo);


        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("du");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}