package br.com.curso.loja;

import br.com.curso.loja.imposto.CalculadoraImpostos;
import br.com.curso.loja.imposto.ICMS;
import br.com.curso.loja.imposto.ISS;
import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {
    public static void main(String[] args) {

        Orcamento ocamento = new Orcamento(new BigDecimal("1000"), 10);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println(calculadora.calcular(ocamento, new ICMS()));
        System.out.println(calculadora.calcular(ocamento, new ISS()));
    }
}
