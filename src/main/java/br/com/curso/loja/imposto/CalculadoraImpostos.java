package br.com.curso.loja.imposto;

import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    //supondo que o imposto ICMS é 10% e o ISS é 6% do valor do orcamento, ICMS
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
