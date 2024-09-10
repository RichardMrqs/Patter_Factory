package PatterFactory;

import modelo.orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao {
    @Override
    public BigDecimal CalculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal(val: "0.12"));
    }
}