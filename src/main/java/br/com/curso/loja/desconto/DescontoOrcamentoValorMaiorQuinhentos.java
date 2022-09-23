package br.com.curso.loja.desconto;

import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Valor maior que 500, desconto de 5%
public class DescontoOrcamentoValorMaiorQuinhentos extends Desconto{
    public DescontoOrcamentoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }
}
