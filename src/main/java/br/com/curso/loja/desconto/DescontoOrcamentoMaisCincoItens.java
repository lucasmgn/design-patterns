package br.com.curso.loja.desconto;

import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Supondo que apartir de 5 itens tem um desconto de 10%
public class DescontoOrcamentoMaisCincoItens extends Desconto{
    public DescontoOrcamentoMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
