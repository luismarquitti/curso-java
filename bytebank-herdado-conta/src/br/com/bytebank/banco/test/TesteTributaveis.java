package br.com.bytebank.banco.test;


import br.com.bytebank.banco.model.CalculadorDeImposto;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,222);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }

}
