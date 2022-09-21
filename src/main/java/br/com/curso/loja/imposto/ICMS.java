package br.com.curso.loja.imposto;

import br.com.curso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Imposto 10%
public class ICMS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
