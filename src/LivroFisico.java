public class LivroFisico extends Livro implements Promocional{

    public LivroFisico (Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.3) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);

        System.out.println("Aplicando desconto do Livro Fisico.");

        return true;
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

}
