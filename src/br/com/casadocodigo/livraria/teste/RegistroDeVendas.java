package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {

    public static void main (String[] args) {

        Autor autor = new Autor();
        LivroFisico fisico = new LivroFisico(autor);
        Ebook ebook = new Ebook(autor);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto[] produtos = carrinho.getProdutos();

        autor.setNome("Mauricio Aniche");

        fisico.setNome("test-driven development");
        fisico.setValor(59.90);

        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);


        if(fisico.aplicaDescontoDe10()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);



        for(int i = 0; i <= produtos.length; i ++) {
            try{

                Produto produto = produtos[i];
                if(produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (Exception e) {
                System.out.println("deu exception no indice: " + i);
                e.printStackTrace();
            }
        }

        System.out.println("total: " + carrinho.getTotal());
    }
}
