package br.com.curso.loja;

import br.com.curso.loja.desconto.CalculadoraDesconto;
import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDesconto {
    public static void main(String[] args) {

        Orcamento ocamento = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento ocamento2 = new Orcamento(new BigDecimal("1000"), 6);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.println(calculadora.calcular(ocamento));
        System.out.println(calculadora.calcular(ocamento2));
    }
}
