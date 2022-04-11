package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import javax.swing.plaf.basic.BasicBorders;
import java.util.Collections;
import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        LivroFisico fisico = new LivroFisico(autor);
        Ebook ebook = new Ebook(autor);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


        autor.setNome("Mauricio Aniche");

        fisico.setNome("test-driven development");
        fisico.setValor(59.90);

        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);


        if (fisico.aplicaDescontoDe10()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }


        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        List<Produto> produtos = carrinho.getProdutos();

        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }

        System.out.println("total: " + carrinho.getTotal());
    }
}
