package br.com.casadocodigo.livraria.produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras () {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona (Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }


    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public double getTotal() {
        return total;
    }
}
