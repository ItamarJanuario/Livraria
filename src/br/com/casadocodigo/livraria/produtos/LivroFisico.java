package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public String toString() {
        return "Livro Fisico";
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);

        System.out.println("Aplicando desconto do Fisico.");

        return true;
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

}
