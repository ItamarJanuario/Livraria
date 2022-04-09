package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;

    public Livro(Autor autor) {
        if (autor == null) {
            throw new AutorNuloException("O autor do livro não pode ser nulo !!");
        }
        this.autor = autor;
    }

    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    Autor autor;

    public void mostrarDetalhes() {

        System.out.println("Mostrando detalhes do livro");
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);


        if(this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

    boolean temAutor() {
        return this.autor != null;
    }

}
