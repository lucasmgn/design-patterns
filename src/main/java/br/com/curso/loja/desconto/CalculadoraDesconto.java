package br.com.curso.loja.desconto;

import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoMaisCincoItens(
                new DescontoOrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}
