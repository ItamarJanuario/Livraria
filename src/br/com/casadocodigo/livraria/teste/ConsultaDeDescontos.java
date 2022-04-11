package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    public static void main (String[] args) {

        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("CAB11");
        

        if(desconto != null) {
            System.out.println("Cupom de desconto valido. ");
            System.out.println("Valor " + desconto);
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }
}
