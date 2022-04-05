public class CarrinhoDeCompras {

    private double total;

    public void adiciona (Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDesconteDe(0.05);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
