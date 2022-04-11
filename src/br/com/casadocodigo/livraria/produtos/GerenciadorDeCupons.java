package br.com.casadocodigo.livraria.produtos;

import java.util.*;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();

        cupons.put("CAB11", 10.0);
        cupons.put("CAB22", 12.0);
        cupons.put("CAB33", 13.0);
        cupons.put("CAB44", 14.0);
    }

    public Double validaCupom(String cupom) {

       return this.cupons.get(cupom);
    }

}
