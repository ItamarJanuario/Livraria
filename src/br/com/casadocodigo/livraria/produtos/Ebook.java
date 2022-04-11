package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String waterMark;


    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public String toString() {
        return "Ebook";
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto do br.com.casadocodigo.livraria.produtos.Ebook");
        return aplicaDescontoDe(porcentagem);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return this.waterMark;
    }
}
