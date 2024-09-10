package org.example;

import PatterFactory.IcmsFactory;
import modelo.orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        
        Orcamento orcamento = new orcamento(new BigDecimal(val: "1000.00"), icmsRegiao: "ICMS_MG");
        IcmsFactory IcmsFactory = new IcmsFactory();
        BigDecimal resultado = IcmsFactory.getIcmsPorEstado(nomeEstado: "ICMS_MG")
            .CalculoPorRegiao(orcamento);

        System.out.printIn(resultado);
    }
}